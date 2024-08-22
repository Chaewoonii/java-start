package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        //더 큰 숫자 찾기, 삼항 연산자 이용, 두 숫자 중 더 큰 숫자 출력
        int a = 10, b = 20;
        int highNum = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + highNum + "입니다.");
    }
}
