import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAdder;
public class App {
    public static void main(String[] args) throws Exception{
        
        init();
        Rating budi = new Rating("Budi", "1854211", "2.5");
        System.out.println(budi);
        Rating anto = new Rating("Anto", "15151110", " 3.8");
        System.out.println(anto);
        Rating gopal = new Rating("gopal", "18415153", "4.8");
        System.out.println(gopal);
    }

    public static void init(){
        Rating budi = new Rating("Budi", "1854211", "2.5");
        Rating anto = new Rating("Anto", "15151110", " 3.8");
        Rating gopal = new Rating("gopal", "18415153", "4.8");
    }

    public static void init(){
        EventKunjunganAmal budi = new EventKunjunganAmal("Donor Darah", "12.00", "01 April 2023");
        EventKunjunganAmal anto = new EventKunjunganAmal("Bakti Sosial", "13.00", "02 Mei 2023");
        EventKunjunganAmal gopal = new EventKunjunganAmal("Ulang Tahun Yayasan", "11.00", "05 Januari 2023");
    }

    public static void init(){
        DaurUlang anita = new DaurUlang("Sedotan", "20", "Anita");
        DaurUlang iwan = new DaurUlang("Kaleng", "10", "Iwan");
        DaurUlang sally = new DaurUlang("Botol Aqua", "5", "Sally");
    }

    public static void init(){
        Donasi Ipin = new Donasi("Barang", "Ipin", "-", "2", "082345670987");
        Donasi Mail = new Donasi("Dana", "Mail", "Rp. 100.000", "-", "082546789345");
        Donasi Rose = new Donasi("Dana", "Rose", "Rp. 500.000", "-", "0812345678909");
    }    

    public static void init() {
        DonorDarah usman = new DonorDarah("Usman Halim", "Laki-laki", "O", "Berhasil");
        DonorDarah susiyanti = new DonorDarah("Susiyanti Tambunan", "Perempuan", "A+", "Gagal");
        DonorDarah susmanto = new DonorDarah("Susmanto Amin", "Laki-laki", "B+", "Berhasil");
    }

    public static void init(){
        Relawan Upin = new Relawan("Upin", "18", "1201008186030062", "Laki-laki", "0857983216521");
        Relawan Ehsan = new Relawan("Ehsan", "12", "120451515860151", "Laki-laki", "0845626295164");
        Relawan jennie = new Relawan("Jennie", "22", "1208151315161315315", "Perempuan", "081511161");
    }
}


