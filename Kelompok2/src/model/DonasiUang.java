package model;

public class DonasiUang extends Donasi{
    String nominalDonasi;


    public DonasiUang(String nominalDonasi) {
        this.nominalDonasi = nominalDonasi;
    }

    public String getNominalDonasi() {
        return this.nominalDonasi;
    }

    public void setNominalDonasi(String nominalDonasi) {
        this.nominalDonasi = nominalDonasi;
    }


    @Override
    public void satuan(){
       
    }

    
}
