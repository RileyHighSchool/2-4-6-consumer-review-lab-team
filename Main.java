public class Main {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("this"));
        System.out.println(Review.sentimentVal("place"));
        System.out.println(Review.sentimentVal("sucks"));
        

        System.out.println(Review.starRating("simpleReview.txt"));
    }
}
