//Kelas ini menampung data Pendonor Darah
//Data yang ditampung berupa Nama Pendonor, Jenis Kelamin Pendonor, Golongan Darah Pendonor, dan Keberhasilan cek darah.
//Kelas ini digunakan untuk mengumpulkan darah dari para pendonor untuk membantu orang yang membutuhkan
public class DonorDarah {
    private String golonganDarahPendonor;
    private String keberhasilanCekDarah;
    private Relawan relawan;



    public DonorDarah() {
    }

    public DonorDarah(String golonganDarahPendonor, String keberhasilanCekDarah, Relawan relawan) {
        this.golonganDarahPendonor = golonganDarahPendonor;
        this.keberhasilanCekDarah = keberhasilanCekDarah;
        this.relawan = relawan;
    }


    public DonorDarah(String golonganDarah, String keberhasilanCekDarah2) {
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

    public Relawan getRelawan() {
        return this.relawan;
    }

    public void setRelawan(Relawan relawan) {
        this.relawan = relawan;
    }

    @Override
    public String toString() {
        return "{" +
            " golonganDarahPendonor='" + getGolonganDarahPendonor() + "'" +
            ", keberhasilanCekDarah='" + getKeberhasilanCekDarah() + "'" +
            ", relawan='" + getRelawan() + "'" +
            "}";
    }

    
    

}
