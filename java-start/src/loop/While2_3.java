package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // 반복문이 3번 수행됨 (i = 1, 2, 3)
        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + ", sum=" + sum);
            i++;
        }
    }
}
