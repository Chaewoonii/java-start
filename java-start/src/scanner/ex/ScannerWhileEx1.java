package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("이름(exit 입력시 종료): ");
            String name = sc.nextLine();

            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이: ");
            int age = sc.nextInt(); // 숫자만 가져옴. \n 가져오지 않아서 입력에 남아있음. -> 다음 입력 시 \n부터 읽게 되며, 빈 문자열이 입력됨.
            sc.nextLine(); // \n을 한 번 읽고 버림 처리.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
