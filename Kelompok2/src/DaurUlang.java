//Pada kelas ini akan menampung jenis barang bekas, jumlah barang bekas, nama dari orang yang mengikuti daur ulang
//Data yang ditampung berupa jenis barang bekas, jumlah barang bekas, dan nama dari yang mengikuti daur ulang
//Kelas ini akan digunakan untuk membantu Tzu Chi mendapatkan barang bekas dalam melakukan daur ulang

public class DaurUlang {
    private String jenisBarangBekas;
    private String jumlahBarangBekas;
    private Relawan relawan;
    

    public DaurUlang(String jenisBarangBekas, String jumlahBarangBekas, Relawan relawan) {
        this.jenisBarangBekas = jenisBarangBekas;
        this.jumlahBarangBekas = jumlahBarangBekas;
        this.relawan = relawan;
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

    public Relawan getRelawan() {
        return this.relawan;
    }

    public void setRelawan(Relawan relawan) {
        this.relawan = relawan;
    }


    @Override
    public String toString() {
        return "|" +
            " " + getJenisBarangBekas() + "'" +
            " " + getJumlahBarangBekas() + "'" +
            " " + getRelawan() + "'" +
            " ";
    }
}
    