// Pada kelas ini akan mengarahkan pengguna untuk memberikan nilai kepada app ini
// Data yang terdapat di dalam akan mengarahakn user untuk menginput data user rating
// Dalam class ini bakal digunakan untuk mengarahkan pengguna untuk memberikan nilai kepada app ini
//owen(03081220010)
public class Rating {
    private String ratingScore;

    public Rating() {
    }


    public Rating(String ratingScore) {
        this.ratingScore = ratingScore;
    }
   

    public String getRatingScore() {
        return this.ratingScore;
    }

    public void setRatingScore(String ratingScore) {
        this.ratingScore = ratingScore;
    }


    @Override
    public String toString() {
        return "{" +
            " ratingScore='" + getRatingScore() + "'" +
            "}";
    }

 
}
