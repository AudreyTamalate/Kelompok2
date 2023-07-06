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
            System.out.println("14. Hapus Data Relawan");
            //System.out.println("15. Hapus Data Donasi");
            System.out.println("16. Hapus Data Daur Ulang");
            System.out.println("17. Hapus Data Donasi Darah");
            System.out.println("16. Hapus Data Event Kunjungan Amal");
            System.out.println("16. Hapus Data Rating");

            


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

                case 14:
                    hapusRelawan(0);
                    break;
               // case 15 :
                   // hapusDonasi(0);
                    //break;
                case 16 :
                    hapusdaurUlang(0);
                    break;
                case 17 :
                    hapusdonorDarah(0);
                    break;
                case 18:
                    hapuseventKunjunganAmal(0);
                break;
                case 19:
                    hapusrating(0);
                break;

                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(!exit);

        scanner.close();
    }

    public static void init() {
        System.out.println("Initializing...");
        
        Relawan upin = new Relawan("Upin", "18", "120888", "Laki-laki", "08188834532");
        relawan.add(upin);
        Relawan ipin = new Relawan("Ipin", "12", "120999", "Laki-laki", "08199912343");
        relawan.add(ipin);
        Relawan apin = new Relawan("Apin", "22", "120777", "Perempuan", "08155545621");
        relawan.add(apin);
        Relawan mail = new Relawan("Mail", "17", "120666", "Laki-laki", "08133378901");
        relawan.add(mail);
        Relawan meimei = new Relawan("Meimei", "25", "120555", "Perempuan", "08122256702");
        relawan.add(meimei);
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
        Scanner input = new Scanner(System.in);
        String jenisDonasi=" ",jumlahDonasi=" ",NIK=" ";
        System.out.print("NIK Relawan\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("Jenis Donasi (1.Dana/2.Barang)\t:");
        if(input.hasNextLine())
           jenisDonasi = input.nextLine();
        System.out.print("Jumlah DonasiDana\t:");
        if(input.hasNextLine())
            jumlahDonasi = input.nextLine();
   


        Donasi.add(new donasi(jenisDonasi, jumlahDonasi,cariRelawan(NIK)));
//tampil
        for (Donasi donasi2 : donasi) {
            System.out.println("GolonganDarahPendonor \t KeberhasilanCekDarah \t");
            System.out.println(donasi2);
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

    public static void inputDaurUlang() {
       Scanner input = new Scanner(System.in);
        String jenisbarangbekas=" ",jumlahbarangbekas=" ";String NIK=" ";
        System.out.print("NIK Relawan\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("jenisbarangbekas\t:");
        if(input.hasNextLine())
            jenisbarangbekas = input.nextLine();
        System.out.print("jumlahbarangbekas\t:");
        if(input.hasNextLine())
            jumlahbarangbekas = input.nextLine();

        daurUlang.add(new DaurUlang(jenisbarangbekas, jumlahbarangbekas,cariRelawan(NIK)));
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
        String golongandarahpendonor=" ",keberhasilancekdarah=" ",NIK=" ";
        System.out.print("NIK Pendonor\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("GolonganDarahPendonor\t:");
        if(input.hasNextLine())
            golongandarahpendonor = input.nextLine();
        System.out.print("KeberhasilanCekDarah(y/n)\t:");
        if(input.hasNextLine())
            keberhasilancekdarah = input.nextLine();
//(String golonganDarahPendonor, String keberhasilanCekDarah, Relawan relawan)
        donorDarah.add(new DonorDarah(golongandarahpendonor, keberhasilancekdarah,cariRelawan(NIK)));
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
    public static Relawan cariRelawan(String NIK){
        for (Relawan relawan2 : relawan) {
            if(relawan2.getNIK().equals(NIK)){
                return relawan2;
            }
        }
        return null;
    }

    public static void inputEventKunjunganAmal() {
       Scanner input = new Scanner(System.in);
        String jadwal=" ";String NIK="";
        System.out.print("NIK Relawan\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("Jadwal\t:");
            jadwal = input.nextLine();

        eventKunjunganAmal.add(new EventKunjunganAmal(jadwal,cariRelawan(NIK)) );
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
        String ratingscore=" ";String NIK=" ";
         System.out.print("NIK Pendonor\t:");
        if(input.hasNextLine())
            NIK = input.nextLine();
        System.out.print("RatingScore(1-5)\t:");
         ratingscore = input.nextLine();
       

        rating.add(new Rating(ratingscore,cariRelawan(NIK)));
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
    

    public static void hapusRelawan(int upin) {
        relawan.remove(upin);
    }

    //public static void hapusDonasi(int upin) {
        //donasi.remove(upin);
    //}

    public static void hapusdaurUlang(int upin) {
        daurUlang.remove(upin);
    }

    public static void hapusdonorDarah(int upin) {
        donorDarah.remove(upin);
    }

    public static void hapuseventKunjunganAmal(int upin) {
        eventKunjunganAmal.remove(upin);
    }

    public static void hapusrating(int upin) {
        rating.remove(upin);
    }

}