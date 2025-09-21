package proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private final Map<String, Set<String>> permissions;

    private AccessControlService() {
        permissions = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void allowUser(String username, String docId) {
        permissions.computeIfAbsent(docId, k -> new HashSet<>()).add(username);
    }

    public boolean isAllowed(String username, String docId) {
        return permissions.containsKey(docId) && permissions.get(docId).contains(username);
    }
}