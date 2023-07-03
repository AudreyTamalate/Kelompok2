//Pada kelas ini akan menampung jenis donasi dan siapa yang memberi donasi tersebut
// Data yang ditampung berupa jenis donasi, nama donatur, jumlah donasi, nomor telepon donatur
//Kelas ini akan digunakan untuk membantu semua kegiatan yang akan dilaksanakan pada Tzu Chi

package model;

public abstract class Donasi {
    private String JenisDonasi;
    private String JumlahDonasiDana;
    private String JumlahDonasiBarang;


    public Donasi(String JenisDonasi, String JumlahDonasiDana, String JumlahDonasiBarang) {
        this.JenisDonasi = JenisDonasi;
        this.JumlahDonasiDana = JumlahDonasiDana;
        this.JumlahDonasiBarang = JumlahDonasiBarang;
    }
    

    public String getJenisDonasi() {
        return this.JenisDonasi;
    }

    public void setJenisDonasi(String JenisDonasi) {
        this.JenisDonasi = JenisDonasi;
    }

    public String getJumlahDonasiDana() {
        return this.JumlahDonasiDana;
    }

    public void setJumlahDonasiDana(String JumlahDonasiDana) {
        this.JumlahDonasiDana = JumlahDonasiDana;
    }

    public String getJumlahDonasiBarang() {
        return this.JumlahDonasiBarang;
    }

    public void setJumlahDonasiBarang(String JumlahDonasiBarang) {
        this.JumlahDonasiBarang = JumlahDonasiBarang;
    }
    


    @Override
    public String toString() {
        return "{" +
            " JenisDonasi='" + getJenisDonasi() + "'" +
            ", JumlahDonasiDana='" + getJumlahDonasiDana() + "'" +
            ", JumlahDonasiBarang='" + getJumlahDonasiBarang() + "'" +
            "}";
    }
    
}
