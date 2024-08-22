package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        // 반복문이 3번 수행됨 (count = 0, 1, 2)
        while (count < 3){
            count += 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
