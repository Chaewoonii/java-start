package variable;

public class Var6 {
    public static void main(String[] args) {
        int a; // 초기화되지 않은 변수는 컴파일 과정에서 삭제됨(최적화를 위해). 따라서, out의 Var6을 열어보면 변수 a가 없다.
//        System.out.println(a); //초기화되지 않은 변수. 컴파일에러 발생
    }
}
