//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

public abstract class Donasi {
    public String jenisDonasi;
    public String jumlahDonasiDana;
    public String jumlahDonasiBarang;
    private Relawan relawan;


    public Donasi(String jenisDonasi, String jumlahDonasiDana, String jumlahDonasiBarang, Relawan relawan) {
        this.jenisDonasi = jenisDonasi;
        this.jumlahDonasiDana = jumlahDonasiDana;
        this.jumlahDonasiBarang = jumlahDonasiBarang;
        this.relawan = relawan;
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

    public Relawan getRelawan() {
        return this.relawan;
    }

    public void setRelawan(Relawan relawan) {
        this.relawan = relawan;
    }


    @Override
    public String toString() {
        return "{" +
            " jenisDonasi='" + getJenisDonasi() + "'" +
            ", jumlahDonasiDana='" + getJumlahDonasiDana() + "'" +
            ", jumlahDonasiBarang='" + getJumlahDonasiBarang() + "'" +
            ", relawan='" + getRelawan() + "'" +
            "}";
    }
}
    