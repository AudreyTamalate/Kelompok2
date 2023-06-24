//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

public abstract class Donasi {
    public String Nama;
    public String Usia;
    public String NIK;
    public String JenisKelamin;
    public String NomorTelepon;
    public String JenisDonasi;
    public String JumlahDonasiDana;
    public String JumlahDonasiBarang;

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


    public Donasi(String jenisDonasi2, String jumlahDonasi) {
    }

    public Donasi(String nama2, String umur, String nik2, String jenisKelamin2, String nomorTelepon2) {
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
