package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        /*
        int temp
        - if 조건이 만족할 때 임시로 사용하는 변수.
        - 임시 변수가 main에 선언되었고, main 코드블럭이 종료될때까지 생존한다면
          비효율적인 메모리 사용, 코드 복잡성 증가라는 문제 발생.
         */
        if (m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
