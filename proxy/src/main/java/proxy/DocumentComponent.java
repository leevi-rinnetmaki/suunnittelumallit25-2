package proxy;
import java.util.Date;

public interface DocumentComponent {
    String getId();
    Date getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}