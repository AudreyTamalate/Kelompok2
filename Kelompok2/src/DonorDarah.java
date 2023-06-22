//Kelas ini menampung data Pendonor Darah
//Data yang ditampung berupa Nama Pendonor, Jenis Kelamin Pendonor, Golongan Darah Pendonor, dan Keberhasilan cek darah.
//Kelas ini digunakan untuk mengumpulkan darah dari para pendonor untuk membantu orang yang membutuhkan
public class DonorDarah {
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;
    private String GolonganDarahPendonor;
    private String KeberhasilanCekDarah;


    public DonorDarah() {
    }

    public DonorDarah(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String GolonganDarahPendonor, String KeberhasilanCekDarah) {
        this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
        this.GolonganDarahPendonor = GolonganDarahPendonor;
        this.KeberhasilanCekDarah = KeberhasilanCekDarah;
    }


    public DonorDarah(String golonganDarah, String keberhasilanCekDarah2) {
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUsia() {
        return this.Usia;
    }

    public void setUsia(String Usia) {
        this.Usia = Usia;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getNomorTelepon() {
        return this.NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
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
    

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", JenisKelamin='" + getJenisKelamin() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            ", GolonganDarahPendonor='" + getGolonganDarahPendonor() + "'" +
            ", KeberhasilanCekDarah='" + getKeberhasilanCekDarah() + "'" +
            "}";
    }

}
