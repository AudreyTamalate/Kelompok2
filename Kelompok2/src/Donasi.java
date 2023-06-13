//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi
public class Donasi {
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;
    private String JenisDonasi;
    private String JumlahDonasiDana;
    private String JumlahDonasiBarang;

    public Donasi() {
    }

    public Donasi (String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang){
        this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
        this.JenisDonasi = JenisDonasi;
        this.JumlahDonasiDana = JumlahDonasiDana;
        this.JumlahDonasiBarang = JumlahDonasiBarang;
    }


    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUsia() {
        return this.Usia;
    }

    public void setUsia(String Usia) {
        this.Usia = Usia;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getNomorTelepon() {
        return this.NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
    }

    public String getJenisDonasi() {
        return this.JenisDonasi;
    }

    public void setJenisDonasi(String JenisDonasi) {
        this.JenisDonasi = JenisDonasi;
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

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", JenisKelamin='" + getJenisKelamin() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            ", JenisDonasi='" + getJenisDonasi() + "'" +
            ", JumlahDonasiDana='" + getJumlahDonasiDana() + "'" +
            ", JumlahDonasiBarang='" + getJumlahDonasiBarang() + "'" +
            "}";
    }
    
}
