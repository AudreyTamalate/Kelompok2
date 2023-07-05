package model;

public class DonasiUang extends Donasi{
    int nominalDonasi;

    public int getNominalDonasi() {
        return this.nominalDonasi;
    }

    public void setNominalDonasi(int nominalDonasi) {
        this.nominalDonasi = nominalDonasi;
    }

    @Override
    public  void test(){
        System.out.println();
    }
}
