// Pada kelas ini akan mengarahkan pengguna untuk memberikan nilai kepada app ini
// Data yang terdapat di dalam akan mengarahakn user untuk menginput data user rating
// Dalam class ini bakal digunakan untuk mengarahkan pengguna untuk memberikan nilai kepada app ini
//owen(03081220010)
public class Rating {
    private String ratingScore;
    private Relawan relawan;
    

    public Rating(String ratingScore, Relawan relawan) {
        this.ratingScore = ratingScore;
        this.relawan = relawan;
    }


    public String getRatingScore() {
        return this.ratingScore;
    }

    public void setRatingScore(String ratingScore) {
        this.ratingScore = ratingScore;
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
            " ratingScore='" + getRatingScore() + "'" +
            ", relawan='" + getRelawan() + "'" +
            "}";
    }





   

 
}
