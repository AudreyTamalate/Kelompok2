//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

package model;

public abstract class Donasi {
    private String jenisDonasi;
    private String jumlahDonasi;
    private String relawan;

    public Donasi() {
    }

    public abstract void satuan();
    
    public Donasi(String jenisDonasi, String relawan) {
        this.jenisDonasi = jenisDonasi;
        this.relawan = relawan;
    }
    

    public String getJenisDonasi() {
        return this.jenisDonasi;
    }

    public void setJenisDonasi(String jenisDonasi) {
        this.jenisDonasi = jenisDonasi;
    }

    public String getJumlahDonasi() {
        return this.jumlahDonasi;
    }

    public void setJumlahDonasi(String jumlahDonasi) {
        this.jumlahDonasi = jumlahDonasi;
    }

    public String getRelawan() {
        return this.relawan;
    }

    public void setRelawan(String relawan) {
        this.relawan = relawan;
    }
    

    @Override
    public String toString() {
        return "|" +
            " " + getJenisDonasi() + "'" +
            " " + getJumlahDonasi() + "'" +
            " " + getRelawan() + "'" +
            " ";
    }

    
    public static void add(Donasi donasi) {
    }
    
    }
