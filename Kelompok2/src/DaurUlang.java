//Pada kelas ini akan menampung jenis barang bekas, jumlah barang bekas, nama dari orang yang mengikuti daur ulang
//Data yang ditampung berupa jenis barang bekas, jumlah barang bekas, dan nama dari yang mengikuti daur ulang
//Kelas ini akan digunakan untuk membantu Tzu Chi mendapatkan barang bekas dalam melakukan daur ulang

public class DaurUlang {
    private String jenisBarangBekas;
    private String jumlahBarangBekas;
    

    public DaurUlang(String jenisBarangBekas, String jumlahBarangBekas) {
        this.jenisBarangBekas = jenisBarangBekas;
        this.jumlahBarangBekas = jumlahBarangBekas;
    }


    public String getJenisBarangBekas() {
        return this.jenisBarangBekas;
    }

    public void setJenisBarangBekas(String jenisBarangBekas) {
        this.jenisBarangBekas = jenisBarangBekas;
    }

    public String getJumlahBarangBekas() {
        return this.jumlahBarangBekas;
    }

    public void setJumlahBarangBekas(String jumlahBarangBekas) {
        this.jumlahBarangBekas = jumlahBarangBekas;
    }


    @Override
    public String toString() {
        return "{" +
            " jenisBarangBekas='" + getJenisBarangBekas() + "'" +
            ", jumlahBarangBekas='" + getJumlahBarangBekas() + "'" +
            "}";
    }
}   