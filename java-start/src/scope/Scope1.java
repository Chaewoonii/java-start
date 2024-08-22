package scope;

public class Scope1 {
    public static void main(String[] args) {
        /*
        - 지역변수: 특정 지역에서만 사용할 수 있는 변수
        - 지역: 변수가 선언된 코드블록{}
        - 지역변수는 변수가 선언된 코드블록 안에서만 생존하고, 선언된 코드블록을 벗어나면 제거되며, 접근할 수 없다.
        - 스코프: 변수의 접근 가능한 범위를 스코프라고 한다.
        */

        int m = 10; // m 생존 시작
        if (true){
            int x = 20; //  if문 안에서만 생존
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료, 접근 불가
//        System.out.println("main x = " + x); //Error
        System.out.println("main m = "+ m);
    }// 생존 종료
}
