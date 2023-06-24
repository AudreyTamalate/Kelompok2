//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

package model;

public abstract class Donasi {
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;
    private String JenisDonasi;
    private String JumlahDonasiDana;
    private String JumlahDonasiBarang;

    public Donasi(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
        this.JenisDonasi = JenisDonasi;
        this.JumlahDonasiDana = JumlahDonasiDana;
        this.JumlahDonasiBarang = JumlahDonasiBarang;
    }

    @Override
    public String toString() {
        return "Nama: " + Nama + "\n" +
                "Usia: " + Usia + "\n" +
                "NIK: " + NIK + "\n" +
                "Jenis Kelamin: " + JenisKelamin + "\n" +
                "Nomor Telepon: " + NomorTelepon + "\n" +
                "Jenis Donasi: " + JenisDonasi + "\n" +
                "Jumlah Donasi (Dana): " + JumlahDonasiDana + "\n" +
                "Jumlah Donasi (Barang): " + JumlahDonasiBarang;
    }
}
