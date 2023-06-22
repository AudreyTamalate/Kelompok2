// Pada kelas ini akan mengarahkan pengguna untuk memberikan nilai kepada app ini
// Data yang terdapat di dalam akan mengarahakn user untuk menginput data user rating
// Dalam class ini bakal digunakan untuk mengarahkan pengguna untuk memberikan nilai kepada app ini
//owen(03081220010)
public class Rating extends Relawan {
    private String Nama;
    private String Usia;
    private String NIK;
    private String JenisKelamin;
    private String NomorTelepon;
    private String RatingScore;

    public Rating() {
    }

    public Rating(String Nama, String Usia, String NIK, String JenisKelamin, String NomorTelepon, String RatingScore){
        this.Nama = Nama;
        this.Usia = Usia;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.NomorTelepon = NomorTelepon;
        this.RatingScore = RatingScore;
    }



    public Rating(String rating) {
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

    public String getRatingScore() {
        return this.RatingScore;
    }

    public void setRatingScore(String RatingScore) {
        this.RatingScore = RatingScore;
    }
    

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", JenisKelamin='" + getJenisKelamin() + "'" +
            ", NomorTelepon='" + getNomorTelepon() + "'" +
            ", RatingScore='" + getRatingScore() + "'" +
            "}";
    }
    

}
