// Pada kelas ini akan mengeluarkan output lokasi penyelenggaraan event, waktu, dan tanggal
// Data yang di keluarkan pada output akan mengarahkan pengguna untuk memilih input
// Dalam class ini bakal mengarahkan pengguna untuk menginput event apa yang akan di pilih
//owen(03081220010)
public class EventKunjunganAmal {
    private String jadwal;


    public EventKunjunganAmal() {
    }
    

    public EventKunjunganAmal(String jadwal) {
        this.jadwal = jadwal;
    }
   

    public String getJadwal() {
        return this.jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }


    @Override
    public String toString() {
        return "{" +
            " jadwal='" + getJadwal() + "'" +
            "}";
    }
    
}