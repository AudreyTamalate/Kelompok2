// Pada kelas ini akan mengeluarkan output lokasi penyelenggaraan event, waktu, dan tanggal
// Data yang di keluarkan pada output akan mengarahkan pengguna untuk memilih input
// Dalam class ini bakal mengarahkan pengguna untuk menginput event apa yang akan di pilih
//owen(03081220010)
public class EventKunjunganAmal {
    private String NamaEvent;
    private String Waktu;
    private String Tanggal;


    public EventKunjunganAmal() {
    }
    
    public EventKunjunganAmal(String NamaEvent, String Waktu, String Tanggal){
        this.NamaEvent = NamaEvent;
        this.Waktu = Waktu;
        this.Tanggal = Tanggal;
    }

    public String getNamaEvent() {
        return this.NamaEvent;
    }

    public void setNamaEvent(String NamaEvent) {
        this.NamaEvent = NamaEvent;
    }

    public String getWaktu() {
        return this.Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }

    public String getTanggal() {
        return this.Tanggal;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    @Override
    public String toString() {
        return "{" +
            " NamaEvent='" + getNamaEvent() + "'" +
            ", Waktu='" + getWaktu() + "'" +
            ", Tanggal='" + getTanggal() + "'" +
            "}";
    }

}
