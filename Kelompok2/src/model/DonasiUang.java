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
    public  void satuan(){
        System.out.println("Satuan Uang(Rp.50.000 atau Rp.100.000)");
    }
}
