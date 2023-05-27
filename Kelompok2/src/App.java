import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    // Add your code for Option 1 here
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    // Add your code for Option 2 here
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    // Add your code for Option 3 here
                    break;
                case 4:
                    System.out.println("Exiting the program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println(); // Add a blank line for separation
        }

        scanner.close();
    }
}


