package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        /*
        * 문제 1 int와 평균
        * 1. num1, num2, num3라는 이름의 세 개의 변수를 선언, 각각 10, 20, 30으로 초기화
        * 2. 세 변수의 합을 계산하고 그 결과를 sum이라는 int 변수에 저장
        * 3. 세 변수의 평균 계산, 결과를 average라는 int 변수에 저장(소수점 이하 결과는 버림)
        * 4. sum과 average의 값을 출력
        * */

        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

    }
}
