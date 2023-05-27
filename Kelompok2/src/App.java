import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("Menu:");
            System.out.println("1. Pendaftaran Relawan");
            System.out.println("2. Donasi Dana dan Barang");
            System.out.println("3. Daur Ulang");
            System.out.println("4. Donor Darah");
            System.out.println("5. Event Kunjugan Amal");
            System.out.println("6. Rating");
            System.out.println("7. Exit");
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
                case 5:
                    System.out.println("You selected Option 2");
                    // Add your code for Option 2 here
                    break;
                case 6:
                    System.out.println("You selected Option 3");
                    // Add your code for Option 3 here
                    break;
                case 7:
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


