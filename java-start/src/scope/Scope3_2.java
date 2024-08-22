package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0){
            int temp = m * 2; // temp를 if문의 지역변수로 선언
            System.out.println("temp = " + temp);
        } // temp 생존 종료
//        System.out.println(temp); 접근 불가
        System.out.println("m = " + m);
    }
}
