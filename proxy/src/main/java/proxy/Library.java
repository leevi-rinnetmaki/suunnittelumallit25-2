package proxy;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<String, DocumentComponent> documents = new HashMap<>();

    public void addUnprotectedDocument(String id, String content) {
        Document doc = new Document(id, new Date(), content);
        documents.put(id, doc);
    }

    public void addProtectedDocument(String id, String content, List<String> allowedUsers) {
        Document doc = new Document(id, new Date(), content);
        DocumentProxy proxy = new DocumentProxy(doc);

        AccessControlService acs = AccessControlService.getInstance();
        for (String user : allowedUsers) {
            acs.allowUser(user, id);
        }

        documents.put(id, proxy);
    }

    public DocumentComponent getDocument(String id) {
        return documents.get(id);
    }
}