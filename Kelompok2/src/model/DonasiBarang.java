package model;

public class DonasiBarang extends Donasi{
    String jenisBarang;
    int jumlahBarang;

    public String getJenisBarang() {
        return this.jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public  void test(){
        System.out.println();
    }
}