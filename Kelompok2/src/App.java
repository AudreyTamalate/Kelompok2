import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Relawan> relawan=new ArrayList<Relawan>();
    public static ArrayList<DaurUlang> daurUlang=new ArrayList<DaurUlang>();
    public static ArrayList<DonorDarah> donorDarah=new ArrayList<DonorDarah>();
    public static ArrayList<Rating> rating=new ArrayList<Rating>();
     public static ArrayList<EventKunjunganAmal> eventKunjunganAmal=new ArrayList<EventKunjunganAmal>();

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
            System.out.println("8. Tampilkan Data Relawan");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1: 
                    inputDataRelawan();
                    break;

                case 2:
                    inputDonasi();
                    break;

                case 3:
                    inputDaurUlang();
                    break;

                case 4:
                    inputDonorDarah();
                    break;

                case 5:
                    inputEventKunjunganAmal();
                    break;

                case 6:
                    inputRating();
                    break;

                case 7:
                    exit = true;
                    break;

                case 8:
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
    

    public static void inputDonasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jenis Donasi");
        System.out.println("1.Donasi Barang");
        System.out.println("2.Donasi Uang");
        System.out.print("Pilih [1/2]: ");
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

        DaurUlang daurUlang = new DaurUlang(jenisDonasi, jumlahDonasi);
    System.out.println(daurUlang);
    System.out.println();

    scanner.close();
}

    public static void inputDaurUlang() {
       Scanner input = new Scanner(System.in);
        String jenisbarangbekas=" ",jumlahbarangbekas=" ";
        System.out.print("jenisbarangbekas\t:");
        if(input.hasNextLine())
            jenisbarangbekas = input.nextLine();
        System.out.print("jumlahbarangbekas\t:");
        if(input.hasNextLine())
            jumlahbarangbekas = input.nextLine();

        daurUlang.add(new DaurUlang(jenisbarangbekas, jumlahbarangbekas));
//tampil
        for (DaurUlang daurulang2 : daurUlang) {
            System.out.println("JenisBarangBekas \t JumlahBarangBekas \t");
            System.out.println(daurulang2);
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

    public static void inputDonorDarah() {
         Scanner input = new Scanner(System.in);
        String golongandarahpendonor=" ",keberhasilancekdarah=" ";
        System.out.print("GolonganDarahPendonor\t:");
        if(input.hasNextLine())
            golongandarahpendonor = input.nextLine();
        System.out.print("KeberhasilanCekDarah\t:");
        if(input.hasNextLine())
            keberhasilancekdarah = input.nextLine();

        donorDarah.add(new DonorDarah(golongandarahpendonor, keberhasilancekdarah));
//tampil
        for (DonorDarah donordarah2 : donorDarah) {
            System.out.println("GolonganDarahPendonor \t KeberhasilanCekDarah \t");
            System.out.println(donordarah2);
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

    public static void inputEventKunjunganAmal() {
       Scanner input = new Scanner(System.in);
        String jadwal=" ";
        System.out.print("Jadwal\t:");
        if(input.hasNextLine())
            jadwal = input.nextLine();
        System.out.print("NomorTelepon\t:");
        if(input.hasNextLine())
            nomorTelepon = input.nextLine();

        eventKunjunganAmal.add(new );
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

    public static void inputRating() {
        Scanner input = new Scanner(System.in);
        String ratingscore=" ";
        System.out.print("RatingScore\t:");
         ratingscore = input.nextLine();
       

        rating.add(new Rating(ratingscore));
//tampil
        for (DonorDarah donordarah2 : donorDarah) {
            System.out.println("GolonganDarahPendonor \t KeberhasilanCekDarah \t");
            System.out.println(donordarah2);
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
}