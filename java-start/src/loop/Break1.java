package loop;

public class Break1 {
    public static void main(String[] args) {
        //break: 만나면 즉시 종료
        //continue: continue 이후 문장 종료, 반복문의 조건식으로 이동

        int sum = 0;
        int i = 1;

        // while true일 경우 break문이 없으면 무한반복
        while (true){
            sum += i; //sum=1+2+3+4+5
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + ", sum=" + sum);
                break;
            }
            i++;
        }

    }
}
