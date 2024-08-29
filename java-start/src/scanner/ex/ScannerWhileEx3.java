package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        int inputNum = 0;

        System.out.println("숫자를 입력하세요. (종료: -1): ");
        /*
        while (true){
            inputNum = sc.nextInt();

            if (inputNum == -1) break;

            sum += inputNum;
            cnt++;
        }
        */

        // 반복문 축약: inputNum의 값이 -1이 아닐 때까지 반복
        while((inputNum = sc.nextInt()) != -1) {
            sum += inputNum;
            cnt++;
        }


        double average = (double) sum / cnt;
        System.out.println(cnt);
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
