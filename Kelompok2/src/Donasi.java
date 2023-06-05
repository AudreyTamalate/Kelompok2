//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi
public class Donasi {
    private String JenisDonasi;
    private String NamaDonatur;
    private String JumlahDonasiDana;
    private String JumlahDonasiBarang;
    private String NomorTelepon;

    public Donasi() {
    }

    public Donasi (String JenisDonasi, String NamaDonatur, String JumlahDonasiDana, String JumlahDonasiBarang, String NomorTelepon){
        this.JenisDonasi = JenisDonasi;
        this.NamaDonatur = NamaDonatur;
        this.JumlahDonasiDana = JumlahDonasiDana;
        this.JumlahDonasiBarang = JumlahDonasiBarang;
        this.NomorTelepon = NomorTelepon;
    }

    public String getJenisDonasi() {
        return this.JenisDonasi;
    }

    public void setJenisDonasi(String JenisDonasi) {
        this.JenisDonasi = JenisDonasi;
    }

    public String getNamaDonatur() {
        return this.NamaDonatur;
    }

    public void setNamaDonatur(String NamaDonatur) {
        this.NamaDonatur = NamaDonatur;
    }

    public String getJumlahDonasiDana() {
        return this.JumlahDonasiDana;
    }

    public void setJumlahDonasiDana(String JumlahDonasiDana) {
        this.JumlahDonasiDana = JumlahDonasiDana;
    }

    public String getJumlahDonasiBarang() {
        return this.JumlahDonasiBarang;
    }

    public void setJumlahDonasiBarang(String JumlahDonasiBarang) {
        this.JumlahDonasiBarang = JumlahDonasiBarang;
    }

    public String getNomorTelepon() {
        return this.NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
    }

    @Override
    public String toString() {
        return "{" +
            " JenisDonasi='" + getJenisDonasi() + "'" +
            ", NamaDonatur='" + getNamaDonatur() + "'" +
            ", JumlahDonasiDana='" + getJumlahDonasiDana() + "'" +
            ", JumlahDonasiBarang='" + getJumlahDonasiBarang() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            "}";
    }


}
