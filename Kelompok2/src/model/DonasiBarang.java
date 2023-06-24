package model;

public class DonasiBarang extends Donasi {
    public DonasiBarang(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        super(Nama, Usia, NIK, JenisKelamin, NomorTelepon, JenisDonasi, JumlahDonasiDana, JumlahDonasiBarang);
    }

    @Override
    public String toString() {
        return "DonasiBarang\n" + super.toString();
    }
}
