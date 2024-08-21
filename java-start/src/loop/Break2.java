package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // for 문 안에 조건식이 없으면 무한반복
        for (; ;){
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + ", sum=" + sum);
                break;
            }
            i++;
        }
    }
}
