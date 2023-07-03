//Kelas ini menampung data Pendonor Darah
//Data yang ditampung berupa Nama Pendonor, Jenis Kelamin Pendonor, Golongan Darah Pendonor, dan Keberhasilan cek darah.
//Kelas ini digunakan untuk mengumpulkan darah dari para pendonor untuk membantu orang yang membutuhkan
public class DonorDarah {
    private String golonganDarahPendonor;
    private String keberhasilanCekDarah;
    



    public DonorDarah() {
    }

    public DonorDarah(String golonganDarahPendonor, String keberhasilanCekDarah, Relawan relawan) {
        this.golonganDarahPendonor = golonganDarahPendonor;
        this.keberhasilanCekDarah = keberhasilanCekDarah;
    }


    public DonorDarah(String golonganDarahPendonor, String keberhasilanCekDarah) {
        this.golonganDarahPendonor = golonganDarahPendonor;
        this.keberhasilanCekDarah = keberhasilanCekDarah;
    }

    public String getGolonganDarahPendonor() {
        return this.golonganDarahPendonor;
    }

    public void setGolonganDarahPendonor(String golonganDarahPendonor) {
        this.golonganDarahPendonor = golonganDarahPendonor;
    }

    public String getKeberhasilanCekDarah() {
        return this.keberhasilanCekDarah;
    }

    public void setKeberhasilanCekDarah(String keberhasilanCekDarah) {
        this.keberhasilanCekDarah = keberhasilanCekDarah;
    }


    @Override
    public String toString() {
        return "{" +
            " golonganDarahPendonor='" + getGolonganDarahPendonor() + "'" +
            ", keberhasilanCekDarah='" + getKeberhasilanCekDarah() + "'" +
            "}";
    }

    
    

}
