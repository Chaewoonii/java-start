package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 오버플로우 예시
        long maxIntValue = 2147483647; // int 최댓값
        long maxIntOver = 2147483648L; // int 최댓값보다 큰 수
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting: " + intValue);

        intValue = (int) maxIntOver; // int의 최댓값보다 큰 수를 int로 캐스팅할 경우
        System.out.println("maxIntOver casting: " + intValue); //-2147483647. int의 제일 작은 수 부터 다시 시작

        // 오버플로우가 발생할 경우, 고민하지 말고 변수 타입을 변경하면 된다.
        // intValue의 형을 int가 아니라 long으로 설정.
    }
}
