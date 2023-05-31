//Kelas ini menampung data Pendonor Darah
//Data yang ditampung berupa Nama Pendonor, Jenis Kelamin Pendonor, Golongan Darah Pendonor, dan Keberhasilan cek darah.
//Kelas ini digunakan untuk mengumpulkan darah dari para pendonor untuk membantu orang yang membutuhkan
public class DonorDarah {

    private String NamaPendonor;
    private String JenisKelaminPendonor;
    private String GolonganDarahPendonor;
    private String KeberhasilanCekDarah;


    public String getNamaPendonor() {
        return this.NamaPendonor;
    }

    public void setNamaPendonor(String NamaPendonor) {
        this.NamaPendonor = NamaPendonor;
    }

    public String getJenisKelaminPendonor() {
        return this.JenisKelaminPendonor;
    }

    public void setJenisKelaminPendonor(String JenisKelaminPendonor) {
        this.JenisKelaminPendonor = JenisKelaminPendonor;
    }

    public String getGolonganDarahPendonor() {
        return this.GolonganDarahPendonor;
    }

    public void setGolonganDarahPendonor(String GolonganDarahPendonor) {
        this.GolonganDarahPendonor = GolonganDarahPendonor;
    }

    public String getKeberhasilanCekDarah() {
        return this.KeberhasilanCekDarah;
    }

    public void setKeberhasilanCekDarah(String KeberhasilanCekDarah) {
        this.KeberhasilanCekDarah = KeberhasilanCekDarah;
    }

}
