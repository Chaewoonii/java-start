package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a-b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈, int형 끼리의 계산은 정수이기 때문에 소수점 표현이 안 됨. (몫만 출력)
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);


        // 0으로 나누는 것은 수학에서 허락하지 않으므로 에러 발생
//        int z = 10 / 0;
    }
}
