package model;

public class DonasiBarang extends Donasi {
    public DonasiBarang(String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        super(JenisDonasi, JumlahDonasiDana, JumlahDonasiBarang);
    }

    public static void DonasiBarang(){
        System.out.prinln("Terimakasih Atas Donasinya")
    }
}
