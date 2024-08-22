package cond.ex;

public class MovieRateEx{
    public static void main(String[] args) {
        // 평점 몇점 이상인 영화 추천.
        double rating = 7.1;

        if (rating <= 9){
            System.out.println("어바웃타임");
        }
        if (rating <= 8){
            System.out.println("토이스토리");
        }
        if (rating <= 7) {
            System.out.println("고질라");
        }
    }
}
