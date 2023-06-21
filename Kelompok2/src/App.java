import java.util.Scanner;

public class App {
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
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRelawan();
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
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
    
    public static void init() {
        System.out.println("Initializing...");
        // Perform any initialization tasks here
    }

    public static void displayRelawan() {
        System.out.println("Relawan :");
        Relawan upin = new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        System.out.println(upin);
        Relawan ipin = new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        System.out.println(ipin);
        Relawan apin = new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        System.out.println(apin);
        System.out.println();
    }

    public static void displayDonasi() {
        System.out.println("Donasi :");
        new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        Donasi upin1 = new Donasi("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Barang", null, "2");
        System.out.println(upin1);
        new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        Donasi ipin1 = new Donasi("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Dana", "Rp. 100.000", null);
        System.out.println(ipin1);
        new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        Donasi apin1 = new Donasi("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Dana", "Rp. 500.000", null);
        System.out.println(apin1);
        System.out.println();
    }

    public static void displayDaurUlang() {
        System.out.println("Daur Ulang :");
        new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        DaurUlang upin2 = new DaurUlang("Sedotan", "20", "Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        System.out.println(upin2);
        new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        DaurUlang ipin2 = new DaurUlang("Kaleng", "10", "Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        System.out.println(ipin2);
        new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        DaurUlang apin2 = new DaurUlang("Botol Aqua", "5", "Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        System.out.println(apin2);
        System.out.println();
    }

    public static void displayDonorDarah() {
        System.out.println("Donor Darah :");
        new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        DonorDarah upin3 = new DonorDarah("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "O", "Berhasil");
        System.out.println(upin3);
        new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        DonorDarah ipin3 = new DonorDarah("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "A+", "Gagal");
        System.out.println(ipin3);
        new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        DonorDarah apin3 = new DonorDarah("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "B+", "Berhasil");
        System.out.println(apin3);
        System.out.println();
    }

    public static void displayEventKunjunganAmal() {
        System.out.println("Event Kunjungan Amal :");
        new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        EventKunjunganAmal upin4 = new EventKunjunganAmal("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Medan, 12 Juli 2023, 12.00pm, makan bersama, panti asuhan suci");
        System.out.println(upin4);
        new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        EventKunjunganAmal ipin4 = new EventKunjunganAmal("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Medan, 1 April 2023, 02.00pm, galang dana, Yayasan Alim");
        System.out.println(ipin4);
        new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        EventKunjunganAmal apin4 = new EventKunjunganAmal("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Binjai, 8 Agustus 2023, 10.00am, sumbangan, panti jumpo sehat");
        System.out.println(apin4);
        System.out.println();
    }

    public static void displayRating() {
        System.out.println("Rating :");
        new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        Rating upin5 = new Rating("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "2.5");
        System.out.println(upin5);
        new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        Rating ipin5 = new Rating("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "3.8");
        System.out.println(ipin5);
        new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        Rating apin5 = new Rating("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "4.8");
        System.out.println(apin5);
        System.out.println();
}
}