package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++){ // for{} 블록 내부, i 생존 시작
            System.out.println("for m = " + m); // 블록 내부외서 외부는 접근 가능
            System.out.println("for i = " + i);
        }// i 생존 종료

//        System.out.println("main i = "+ i); //Error: cannot to find Symbol. 접근 불가
        System.out.println("main m = "+ m);
    }
}
