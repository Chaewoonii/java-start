package method;

import org.w3c.dom.ls.LSOutput;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다 =");
        return; // 반환 타입이 void인 경우 생략 가능. (자바 컴파일러가 return 을 넣어줌)
    }
    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
