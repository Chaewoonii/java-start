package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 0;
        int exchangeRate = 1300;
        int won;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0){
            won = dollar * exchangeRate;
            System.out.println("환전 금액은 " + won + "원입니다");
        }
    }
}
