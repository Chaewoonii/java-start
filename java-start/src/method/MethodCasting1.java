package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); // int에 double을 넣을 수 없으므로 컴파일오류 발생
        printNumber((int) number); // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
