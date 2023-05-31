//Pada kelas ini akan menampung jenis barang bekas, jumlah barang bekas, nama dari orang yang mengikuti daur ulang
//Data yang ditampung berupa jenis barang bekas, jumlah barang bekas, dan nama dari yang mengikuti daur ulang
//Kelas ini akan digunakan untuk membantu Tzu Chi mendapatkan barang bekas dalam melakukan daur ulang
public class DaurUlang {
    private String JenisBarangBekas;
    private String JumlahBarangBekas;
    private String Nama;


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

}
