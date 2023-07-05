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

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Relawan");
            System.out.println("2. Donasi");
            System.out.println("3. Daur Ulang");
            System.out.println("4. Donor Darah");
            System.out.println("5. Event Kunjungan Amal");
            System.out.println("6. Rating");
            System.out.println("7. Exit");
            System.out.println("8. Tampilkan Data Relawan");
            System.out.println("9. Tampilkan Data Donasi");
            System.out.println("10. Tampilkan Data DaurUlang");
            System.out.println("11. Tampilkan Data Donor Darah");
            System.out.println("12. Tampilkan Data Event Kunjungan Amal");
            System.out.println("13. Tampilkan Data Rating");


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
                    break;
                
                //case 9:
                    //tampilDataRelawan();
                    //exit = true;
                   // break;
                
                
                case 10:
                    tampilDataDaurUlang();
                    break;

                case 11:
                    tampilDataDonorDarah();
                    break;
                
                case 12:
                    tampilDataEventKunjunganAmal();
                    break;
                
                case 13:
                    tampilDataRating();
                    break;
                
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(!exit);

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
        

        System.out.println("DaurUlang berhasil!!!");

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
        System.out.print("KeberhasilanCekDarah(y/n)\t:");
        if(input.hasNextLine())
            keberhasilancekdarah = input.nextLine();

        donorDarah.add(new DonorDarah(golongandarahpendonor, keberhasilancekdarah));
//tampil
        for (DonorDarah donordarah2 : donorDarah) {
            System.out.println("GolonganDarahPendonor \t KeberhasilanCekDarah \t");
            System.out.println(donordarah2);
        }
        
        System.out.println();
        

        System.out.println("Donor Darah Berhasil!!!");

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
            jadwal = input.nextLine();

        eventKunjunganAmal.add(new EventKunjunganAmal(jadwal) );
//tampil
        for (EventKunjunganAmal eventKunjunganAmal2: eventKunjunganAmal) {
            System.out.println("Jadwal");
            System.out.println(eventKunjunganAmal2);
        }
        
        System.out.println();
        

        System.out.println("Selamat Event Kunjungan anda telah terdaftar!!!");

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
        System.out.print("RatingScore(1-5)\t:");
         ratingscore = input.nextLine();
       

        rating.add(new Rating(ratingscore));
//tampil
        for (Rating rating2 : rating) {
            System.out.println("RatingScore");
            System.out.println(rating2);
        
        }
        
        System.out.println();
        

        System.out.println("TerimaKasih atas Rating anda!!!");

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
        for (Relawan relawan2 : relawan) {
            System.out.println("Nama \t Usia \t NIK \t JK \t Tlp");
            System.out.println(relawan2);
        }
    }

    public static void tampilDataDaurUlang(){
        for (DaurUlang daurulang2 : daurUlang) {
            System.out.println("Jenis Barang Bekas \t Jumlah Barang Bekas \t");
            System.out.println(daurulang2);
            }
    }

    public static void tampilDataDonorDarah(){
        for (DonorDarah donordarah2 : donorDarah) {
            System.out.println("Golongan Darah Pendonor \t Keberhasilan Cek Darah \t");
            System.out.println(donordarah2);
            }
    }

    public static void tampilDataEventKunjunganAmal(){
        for (EventKunjunganAmal eventkunjunganamal2 : eventKunjunganAmal) {
            System.out.println("Jadwal \t ");
            System.out.println(eventkunjunganamal2);     
            }
    }

    public static void tampilDataRating(){
        for (Rating rating2 : rating) {
            System.out.println("Jadwal \t ");
            System.out.println(rating2);
        }
    }


}