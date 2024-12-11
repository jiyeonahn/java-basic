package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "트와일라잇";
        movieReview1.review = "뱀파이어와 인간의 사랑이야기";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};
        for(MovieReview movieReview : movieReviews){
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
}
