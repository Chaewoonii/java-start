package method;

public class OverLoading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2); // 매개변수 타입 순서에 따라 다른 메소드가 호출됨
        myMethod(1.2, 1);
    }

    public static void myMethod(int a, double b){
        System.out.println("1번: int a, double b");
    }

    public static void myMethod(double a, int b){
        System.out.println("2번: double a, int b");
    }
}
