package method.ex;

import java.util.Scanner;

public class MethodEx4_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();
            int amount;

            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                bank.deposit(amount);

            } else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                bank.withdraw(amount);

            }else if (option == 3) {
                bank.checkBalance();

            }else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 선택이 아닙니다. 다시 선택하세요.");
            }
        }
    }
}
