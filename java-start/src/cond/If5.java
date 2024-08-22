package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 조건문이 서로 연관이 없고, 독립적으로 실행되어야할 경우, else if를 쓰지 않고 각각 씀
        if (price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10){
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");

    }
}
