package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int maxNum, minNum;

        for(int i = 0; i < count; i++){
            numbers[i] = scanner.nextInt();
        }

        minNum = maxNum = numbers[0];
        for(int i = 0; i < count; i++){
            if(numbers[i] > maxNum) maxNum = numbers[i];
            if(numbers[i] < minNum) minNum = numbers[i];
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}
