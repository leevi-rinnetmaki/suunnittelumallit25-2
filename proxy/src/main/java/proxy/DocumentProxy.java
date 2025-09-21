package proxy;
import java.util.Date;

public class DocumentProxy implements DocumentComponent {
    private final String id;
    private final Date creationDate;
    private final Document realDocument;
    private final AccessControlService acs;

    public DocumentProxy(Document realDocument) {
        this.id = realDocument.getId();
        this.creationDate = realDocument.getCreationDate();
        this.realDocument = realDocument;
        this.acs = AccessControlService.getInstance();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (acs.isAllowed(user.username, id)) {
            return realDocument.getContent(user);
        }
        throw new AccessDeniedException("Access denied for user " + user.username + " on document " + id);
    }
}