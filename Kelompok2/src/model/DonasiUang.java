package model;

public class DonasiUang extends Donasi {
    public DonasiUang(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        super(Nama, Usia, NIK, JenisKelamin, NomorTelepon, JenisDonasi, JumlahDonasiDana, JumlahDonasiBarang);
    }

    @Override
    public String toString() {
        return "DonasiUang\n" + super.toString();
    }
}
