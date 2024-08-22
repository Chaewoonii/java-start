package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // do 코드블럭, 최초 1회는 꼭 실행한다.
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        }while (i < 3); // 10<3은 false이므로 실행안됨.
    }
}
