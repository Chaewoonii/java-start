package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5; // num1의 값 초기화: 5
        int num2 = num1; // num1의 값 5를 읽어 num2에 대입. 결과: num1(5), num2(5)
        // num1 변수 자체가 num2에 들어가는 것이 아님. num1의 값을 읽고, **복사하여** num2에 대입하는 것
        num2 = 10; // num2에 10을 대입. 결과: num1(5), num2(10)

        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
