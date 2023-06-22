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
            scanner.nextLine();

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
    }

    public static void displayRelawan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Relawan :");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        String umur = scanner.nextLine();

        System.out.print("NIK: ");
        String nik = scanner.nextLine();

        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Nomor Telepon: ");
        String nomorTelepon = scanner.nextLine();

        System.out.println("Selamat anda telah terdaftar!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        }

        Donasi donasi = new Donasi(nama, umur, nik, jenisKelamin, nomorTelepon);
        System.out.println(donasi);
        System.out.println();

        scanner.close();
    }

    public static void displayDonasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donasi :");
        System.out.print("Jenis Donasi: ");
        String jenisDonasi = scanner.nextLine();

        System.out.print("Jumlah Donasi: ");
        String jumlahDonasi = scanner.nextLine();

        System.out.println("Terima kasih atas donasi anda!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
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
        }

        DaurUlang daurUlang = new DaurUlang(jenisBarangBekas, jumlahBarangBekas);
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
        }

        Rating volunteerRating = new Rating(rating);
        System.out.println(volunteerRating);
        System.out.println();

        scanner.close();
    }
}
