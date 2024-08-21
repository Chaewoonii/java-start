package cond;

public class CondOp1 {
    public static void main(String[] args) {

        int age1 = 18;
        String status1;
        if (age1 >= 18) {
            status1 = "성인";
        } else {
            status1 = "미성년자";
        }
        System.out.println("age1 = " + age1 + ", status1 = " + status1);


        /*
         * 삼항연산자: 단순히 참과 거짓에 따라 특정 값을 구하는 경우
         * 삼항 연산자(조건 연산자)라고 불리는 ?: 연산자를 사용
         * */

        int age2 = 17;
        String status2 = (age2 >= 18) ? "성인" : "미성년자";
        System.out.println("age2 = " + age2 + ", status2 = " + status2);
    }

}
