package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result1 = a > 10 && a < 20; // (a > 10) && (a < 20)
        System.out.println("result1 = " +result1);

        /*
        * 다음과 같이 변수의 위치를 변경해도 결과 같음.
        * 범위를 나타내는 경우 아래와 같이 작성하면 조금 더 읽기 좋다.
        * */
        boolean result2 = 10 < a && a < 20;
        System.out.println("result2 = " +result2);

    }
}
