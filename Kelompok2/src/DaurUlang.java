//Pada kelas ini akan menampung jenis barang bekas, jumlah barang bekas, nama dari orang yang mengikuti daur ulang
//Data yang ditampung berupa jenis barang bekas, jumlah barang bekas, dan nama dari yang mengikuti daur ulang
//Kelas ini akan digunakan untuk membantu Tzu Chi mendapatkan barang bekas dalam melakukan daur ulang
public class DaurUlang {
    private String JenisBarangBekas;
    private String JumlahBarangBekas;
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;;


    public DaurUlang() {
    }
    public DaurUlang(String JenisBarangBekas, String JumlahBarangBekas, String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon){
        this.JenisBarangBekas = JenisBarangBekas;
        this.JumlahBarangBekas = JumlahBarangBekas;
        this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
    }


    public String getJenisBarangBekas() {
        return this.JenisBarangBekas;
    }

    public void setJenisBarangBekas(String JenisBarangBekas) {
        this.JenisBarangBekas = JenisBarangBekas;
    }

    public String getJumlahBarangBekas() {
        return this.JumlahBarangBekas;
    }

    public void setJumlahBarangBekas(String JumlahBarangBekas) {
        this.JumlahBarangBekas = JumlahBarangBekas;
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
    
    @Override
    public String toString() {
        return "{" +
            " JenisBarangBekas='" + getJenisBarangBekas() + "'" +
            ", JumlahBarangBekas='" + getJumlahBarangBekas() + "'" +
            ", Nama='" + getNama() + "'" +
            ", Usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", JenisKelamin='" + getJenisKelamin() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            "}";
    }


}
