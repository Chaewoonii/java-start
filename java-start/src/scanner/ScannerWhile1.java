package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("문자를 입력하세요(exit: 종료): ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("입력한 문자: " + input);
            }
        }
    }
}
