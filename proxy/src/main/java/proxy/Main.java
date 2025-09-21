package proxy;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User alice = new User("alice");
        User bob = new User("bob");
        library.addUnprotectedDocument("doc1", "This is a public document.");
        library.addProtectedDocument("doc2", "This is a secret document.", Arrays.asList("alice"));

        try {
            System.out.println("doc1 (Alice): " + library.getDocument("doc1").getContent(alice));
            System.out.println("doc1 (Bob): " + library.getDocument("doc1").getContent(bob));
            System.out.println("doc2 (Alice): " + library.getDocument("doc2").getContent(alice));
            System.out.println("doc2 (Bob): " + library.getDocument("doc2").getContent(bob));

        } catch (AccessDeniedException e) {
            System.err.println(e.getMessage());
        }
    }
}