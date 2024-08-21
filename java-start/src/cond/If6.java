package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // else if 를 사용할 경우, 두 개의 할인 조건이 적용됨에도 불구하고 한 번만 적용됨.
        if (price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10){
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // if문의 코드블럭을 생략할 경우, 다음 코드라인 1개만 포함하여 실행됨
        // 헷갈리니 코드블럭을 쓸 것~~
        if (false)
            System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행안됨");

    }
}
