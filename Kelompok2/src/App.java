import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("Menu:");
            System.out.println("1. Relawan");
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

    public static void init(){
        Rating budi = new Rating("Budi", "1854211", "2.5");
        Rating anto = new Rating("Anto", "15151110", " 3.8");
        Rating gopal = new Rating("gopal", "18415153", "4.8");
    }

    public static void init(){
        Eventkunjunganamal budi = new Eventkunjunganamal("Donor Darah", "12.00", "01 April 2023");
        Eventkunjunganamal anto = new Eventkunjunganamal("Bakti Sosial", "13.00", "02 Mei 2023");
        Eventkunjunganamal gopal = new Eventkunjunganamal("Ulang Tahun Yayasan", "11.00", "05 Januari 2023");
    }
}


