import java.util.*;

public class Main {
    private static List<Recommendation> recommendations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Recommendation rec1 = new Recommendation("Young Adults");
        rec1.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));
        rec1.addBook(new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 2008));
        recommendations.add(rec1);

        while (true) {
            System.out.println("\n=== Book Recommendation System ===");
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone Recommendation");
            System.out.println("3. Create New Recommendation");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewRecommendations();
                    break;
                case 2:
                    cloneRecommendation();
                    break;
                case 3:
                    createRecommendation();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void viewRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
            return;
        }
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("\n[" + (i + 1) + "] " + recommendations.get(i));
        }
    }

    private static void cloneRecommendation() {
        viewRecommendations();
        if (recommendations.isEmpty()) return;

        System.out.print("Enter the number of the recommendation to clone: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        Recommendation cloned = recommendations.get(index).clone();
        System.out.print("Enter new target audience for this cloned recommendation: ");
        cloned.setTargetAudience(scanner.nextLine());

        recommendations.add(cloned);
        System.out.println("Recommendation cloned successfully!");
    }

    private static void createRecommendation() {
        System.out.print("Enter target audience: ");
        String audience = scanner.nextLine();

        Recommendation rec = new Recommendation(audience);

        while (true) {
            System.out.print("Enter book title (or 'done' to finish): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("done")) break;

            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();

            System.out.print("Enter publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            rec.addBook(new Book(title, author, genre, year));
        }

        recommendations.add(rec);
        System.out.println("New recommendation created successfully!");
    }
}