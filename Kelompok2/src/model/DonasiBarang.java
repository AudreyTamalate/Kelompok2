package model;

public class DonasiBarang extends Donasi{
    String jenisBarang;
    String jumlahBarang;

    public String getJenisBarang() {
        return this.jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getJumlahBarang() {
        return this.jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public  void satuan(){
        System.out.println("Apakah barang anda dalam satuan? Jika iya masukan satuan, jika tidak (-)");
    }
}