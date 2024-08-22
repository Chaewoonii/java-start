package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생. 소수점 삭제
        intValue = (int) doubleValue; // int로 형변환(캐스팅)
        System.out.println("intValue = " + intValue); // 1 출력, 정수이기 때문에 소수는 삭제된다.
        // doubleValue 안에 있는 값을 읽어서 형변환을 하는 것이지, doubleValue의 값 자체가 변경되는것은 아님.
        // 따라서, doubleValue안의 값은 1.5.로 유지됨.
        System.out.println("doubleValue = " + doubleValue);

    }
}
