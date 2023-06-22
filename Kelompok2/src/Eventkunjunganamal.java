// Pada kelas ini akan mengeluarkan output lokasi penyelenggaraan event, waktu, dan tanggal
// Data yang di keluarkan pada output akan mengarahkan pengguna untuk memilih input
// Dalam class ini bakal mengarahkan pengguna untuk menginput event apa yang akan di pilih
//owen(03081220010)
public class EventKunjunganAmal {
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;
    private String Jadwal;


    public EventKunjunganAmal() {
    }
    
    public EventKunjunganAmal(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String Jadwal){
         this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
        this.Jadwal = Jadwal;
    }


    public EventKunjunganAmal(String namaEvent, String daftarEvent) {
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

    public String getJadwal() {
        return this.Jadwal;
    }

    public void setJadwal(String Jadwal) {
        this.Jadwal = Jadwal;
    }
    

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", JenisKelamin='" + getJenisKelamin() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            ", Jadwal='" + getJadwal() + "'" +
            "}";
    }

}