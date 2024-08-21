package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

        /* 아래와 같이 for문 안에 여러 변수를 선언하여 사용할 수도 있다.
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
         */
    }
}
