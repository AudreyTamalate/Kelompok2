import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Relawan> relawan=new ArrayList<Relawan>();
    public static void main(String[] args) throws Exception {
        init();


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Menu ===");
            System.out.println("1. Relawan");
            System.out.println("2. Donasi");
            System.out.println("3. Daur Ulang");
            System.out.println("4. Donor Darah");
            System.out.println("5. Event Kunjungan Amal");
            System.out.println("6. Rating");
            System.out.println("7. Exit");
            System.out.println("9. Tampilkan Data Relawan");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1: 
                    inputDataRelawan();
                    break;

                case 2:
                    displayDonasi();
                    break;

                case 3:
                    displayDaurUlang();
                    break;

                case 4:
                    displayDonorDarah();
                    break;

                case 5:
                    displayEventKunjunganAmal();
                    break;

                case 6:
                    displayRating();
                    break;

                case 7:
                    exit = true;
                    break;
                case 9:
                    tampilDataRelawan();
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void init() {
        System.out.println("Initializing...");
        
        Relawan upin = new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        relawan.add(upin);
        Relawan ipin = new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        relawan.add(ipin);
        Relawan apin = new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        relawan.add(apin);
    }
    
    public static void inputDataRelawan(){
        Scanner input = new Scanner(System.in);
        String nama=" ",usia=" ",NIK=" ",jenisKelamin=" ",nomorTelepon=" ";
        System.out.print("Nama\t:");
        if(input.hasNextLine())
            nama = input.nextLine();
        System.out.print("Usia\t:");
        if(input.hasNextLine())
            usia = input.nextLine();
        System.out.print("NIK\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("JenisKelamin(L/P)\t:");
        if(input.hasNextLine())
            jenisKelamin= input.nextLine();
        System.out.print("NomorTelepon\t:");
        if(input.hasNextLine())
            nomorTelepon = input.nextLine();

        relawan.add(new Relawan(nama, usia, NIK, jenisKelamin, nomorTelepon));
//tampil
        for (Relawan relawan2 : relawan) {
            System.out.println("Nama \t Usia \t NIK \t JK \t Tlp");
            System.out.println(relawan2);
        }
        
        System.out.println();
        

        System.out.println("Selamat anda telah terdaftar!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }
        
        input.close();
        

    }
    public static void tampilDataRelawan(){
        
//tampil
        for (Relawan relawan2 : relawan) {
            System.out.println("Nama \t Usia \t NIK \t JK \t Tlp");
            System.out.println(relawan2);
        }
    }

    public static void displayDonasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donasi");
        System.out.println("1.Donasi Barang");
        System.out.println("2.Donasi Uang");
        System.out.print("Jenis Donasi: ");
        String jenisDonasi = scanner.nextLine();

        System.out.print("Jumlah Donasi: ");
        String jumlahDonasi = scanner.nextLine();

        System.out.println("Terima kasih atas donasi anda!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        Donasi donasi = new Donasi(jenisDonasi, jumlahDonasi);
    System.out.println(donasi);
    System.out.println();

    scanner.close();
}

    public static void displayDaurUlang() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daur Ulang :");
       
        
        System.out.print("Jenis Barang Bekas: ");
        String jenisBarangBekas = scanner.nextLine();

        System.out.print("Jumlah Barang Bekas: ");
        String jumlahBarangBekas = scanner.nextLine();

        System.out.println("Terima kasih atas barang daur ulang anda!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        DaurUlang daurUlang = new DaurUlang(jenisBarangBekas, jumlahBarangBekas,relawan.get(0));
    System.out.println(daurUlang);
    System.out.println();

        scanner.close();
    }

    public static void displayDonorDarah() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donor Darah :");
        System.out.print("Golongan Darah: ");
        String golonganDarah = scanner.nextLine();

        System.out.print("Keberhasilan Cek Darah (ya/tidak): ");
        String keberhasilanCekDarah = scanner.nextLine();

        System.out.println("Anda telah berhasil mendaftar!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        DonorDarah donorDarah = new DonorDarah(golonganDarah, keberhasilanCekDarah);
        System.out.println(donorDarah);
        System.out.println();

        scanner.close();
    }

    public static void displayEventKunjunganAmal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Event Kunjungan Amal :");
        System.out.print("Event yang ingin anda ikuti: ");
        String namaEvent = scanner.nextLine();

        System.out.print("Daftar untuk event ini (yes/no): ");
        String daftarEvent = scanner.nextLine();

        System.out.println("Selamat pendaftaran anda berhasil!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        EventKunjunganAmal eventKunjunganAmal = new EventKunjunganAmal(namaEvent, daftarEvent);
        System.out.println(eventKunjunganAmal);
        System.out.println();

        scanner.close();
    }

    public static void displayRating() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rating :");
        System.out.print("Silahkan Masukkan Rating Anda (1-5): ");
        String rating = scanner.nextLine();

        System.out.println("Terima kasih atas masukan anda!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        Rating volunteerRating = new Rating(rating);
        System.out.println(volunteerRating);
        System.out.println();

        scanner.close();
    }
}
