//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

package model;

public abstract class Donasi {
    private String jenisDonasi;
    private String jumlahDonasiDana;
    private String jumlahDonasiBarang;

    public Donasi() {
    }


    public Donasi(String jenisDonasi, String jumlahDonasiDana, String jumlahDonasiBarang) {
        this.jenisDonasi = jenisDonasi;
        this.jumlahDonasiDana = jumlahDonasiDana;
        this.jumlahDonasiBarang = jumlahDonasiBarang;
    }

    public abstract void donation();
    public void donasi(){
        System.out.println("Donasi Berhasil!!!");
    }
    

    public String getJenisDonasi() {
        return this.jenisDonasi;
    }

    public void setJenisDonasi(String jenisDonasi) {
        this.jenisDonasi = jenisDonasi;
    }

    public String getJumlahDonasiDana() {
        return this.jumlahDonasiDana;
    }

    public void setJumlahDonasiDana(String jumlahDonasiDana) {
        this.jumlahDonasiDana = jumlahDonasiDana;
    }

    public String getJumlahDonasiBarang() {
        return this.jumlahDonasiBarang;
    }

    public void setJumlahDonasiBarang(String jumlahDonasiBarang) {
        this.jumlahDonasiBarang = jumlahDonasiBarang;
    }


}