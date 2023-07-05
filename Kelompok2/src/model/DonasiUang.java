package model;


public class DonasiUang extends Donasi {
    public DonasiUang(String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        super(JenisDonasi, JumlahDonasiDana, JumlahDonasiBarang);
    }

    public static void DonasiUang(){
        System.out.prinln("Terimakasih Atas Donasinya");
    }

public class DonasiUang  extends Donasi {
    @Override
    public void donasi(){
        System.out.println("DonasiUang Berhasil!!!");
    }
    
}
}