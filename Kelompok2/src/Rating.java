// Pada kelas ini akan mengarahkan pengguna untuk memberikan nilai kepada app ini
// Data yang terdapat di dalam akan mengarahakn user untuk menginput data user rating
// Dalam class ini bakal digunakan untuk mengarahkan pengguna untuk memberikan nilai kepada app ini
//owen(03081220010)
public class Rating {
    private String Nama;
    private String NIK;
    private String RatingScore;

    public Rating() {
    }

    public Rating(String Nama, String NIK, String RatingScore){
        this.Nama = Nama;
        this.NIK = NIK;
        this.RatingScore = RatingScore;
    }


    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
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
            ", NIK='" + getNIK() + "'" +
            ", RatingScore='" + getRatingScore() + "'" +
            "}";
    }

}
