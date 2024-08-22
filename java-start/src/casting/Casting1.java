package casting;

public class Casting1 {
    public static void main(String[] args) {
        /*
         자동(묵시적) 형변환
         - 기본적으로 작은 범위에서 큰 범위로 값을 넣을 수 있다.
         - 그러나, 큰 범위에서 작은 범위로 값을 넣으면 소수점 버림, 오버플로우와 같은 문제가 발생할 수 있다.
         */
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // long -> int
        // longValue = (long) intValue //(long): 형변환. 자바 내부에서 자동으로 형변환이 이루어지기 때문에 생략 가능
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // double -> int
        //doubleValue = (double) intValue // 형변환
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 2000000000L; // double -> long
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
