import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;
public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Relawan :");
        init();
        Relawan upin = new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        System.out.println(upin);
        Relawan ipin = new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        System.out.println(ipin);
        Relawan apin = new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        System.out.println(apin);

        System.out.println("");
        System.out.println("Donasi :");
        init();
        Donasi upin1 = new Donasi("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Barang", null, "2");
        System.out.println(upin1);
        Donasi ipin1 = new Donasi("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Dana", "Rp. 100.000", null);
        System.out.println(ipin1);
        Donasi apin1 = new Donasi("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Dana", "Rp. 500.000", null);
        System.out.println(apin1);

        System.out.println("");
        System.out.println("Daur Ulang :");
        init();
        DaurUlang upin2 = new DaurUlang("Sedotan", "20", "Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        System.out.println(upin2);
        DaurUlang ipin2 = new DaurUlang("Kaleng", "10", "Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        System.out.println(ipin2);
        DaurUlang apin2 = new DaurUlang("Botol Aqua", "5", "Apin", "22", "1208151315161315315", "Perempuan", "081511161");
        System.out.println(apin2);

        System.out.println("");
        System.out.println("Donor Darah :");
        init();
        DonorDarah upin3 = new DonorDarah("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "O", "Berhasil");
        System.out.println(upin3);
        DonorDarah ipin3 = new DonorDarah("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "A+", "Gagal");
        System.out.println(ipin3);
        DonorDarah apin3 = new DonorDarah("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "B+", "Berhasil");
        System.out.println(apin3);

        System.out.println("");
        System.out.println("Event Kunjungan Amal :");
        init();
        EventKunjunganAmal upin4 = new EventKunjunganAmal("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Medan, 12 Juli 2023, 12.00pm, makan bersama, panti asuhan suci");
        System.out.println(upin4);
        EventKunjunganAmal ipin4 = new EventKunjunganAmal("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Medan, 1 April 2023, 02.00pm, galang dana, Yayasan Alim");
        System.out.println(ipin4);
        EventKunjunganAmal apin4 = new EventKunjunganAmal("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Binjai, 8 Agustus 2023, 10.00am, sumbangan, panti jumpo sehat");
        System.out.println(apin4);


        System.out.println("");
        System.out.println("Rating :");
        init();
        Rating upin5 = new Rating("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "2.5");
        System.out.println(upin5);
        Rating ipin5 = new Rating("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "3.8");
        System.out.println(ipin5);
        Rating apin5 = new Rating("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "4.8");
        System.out.println(apin5);

        
    }


    public static void init(){
        Relawan upin = new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        Relawan ipin = new Relawan("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        Relawan apin = new Relawan("Apin", "22", "1208151315161315315", "Perempuan", "081511161");
    }

    public static void init(){
        Rating upin5 = new Rating("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "2.5");
        Rating ipin5 = new Rating("Ehsan", "12", "120451515860151", "Laki-laki", "0845626295164", " 3.8");
        Rating apin5 = new Rating("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "4.8");
    }

    public static void init(){
        EventKunjunganAmal upin4 = new EventKunjunganAmal("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Medan, 12 Juli 2023, 12.00pm, makan bersama, panti asuhan suci");
        EventKunjunganAmal ipin4 = new EventKunjunganAmal("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Medan, 1 April 2023, 02.00pm, galang dana, Yayasan Alim");
        EventKunjunganAmal apin4 = new EventKunjunganAmal("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Binjai, 8 Agustus 2023, 10.00am, sumbangan, panti jumpo sehat");
    }

    public static void init(){
        DaurUlang upin2 = new DaurUlang("Sedotan", "20", "Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        DaurUlang ipin2 = new DaurUlang("Kaleng", "10", "Ipin", "12", "120451515860151", "Laki-laki", "0845626295164");
        DaurUlang apin2 = new DaurUlang("Botol Aqua", "5", "Apin", "22", "1208151315161315315", "Perempuan", "081511161");
    }

    public static void init(){
        Donasi upin1 = new Donasi("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "Barang", null, "2");
        Donasi ipin1 = new Donasi("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "Dana", "Rp. 100.000", null);
        Donasi apin1 = new Donasi("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "Dana", "Rp. 500.000", null);
    }    

    public static void init() {
        DonorDarah upin3 = new DonorDarah("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521", "O", "Berhasil");
        DonorDarah ipin3 = new DonorDarah("Ipin", "12", "120451515860151", "Laki-laki", "0845626295164", "A+", "Gagal");
        DonorDarah Apin3 = new DonorDarah("Apin", "22", "1208151315161315315", "Perempuan", "081511161", "B+", "Berhasil");
    }


}


