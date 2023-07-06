// Pada kelas ini akan mengeluarkan output lokasi penyelenggaraan event, waktu, dan tanggal
// Data yang di keluarkan pada output akan mengarahkan pengguna untuk memilih input
// Dalam class ini bakal mengarahkan pengguna untuk menginput event apa yang akan di pilih
//owen(03081220010)
public class EventKunjunganAmal {
    private String jadwal;
    private Relawan relawan;
    

    public EventKunjunganAmal(String jadwal, Relawan relawan) {
    this.jadwal = jadwal;
    this.relawan = relawan;
    }


    public String getJadwal() {
        return this.jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
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
            " jadwal='" + getJadwal() + "'" +
            ", relawan='" + getRelawan() + "'" +
            "}";
    }
}

