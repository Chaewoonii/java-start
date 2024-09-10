package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i){
        if (i % 2 == 1){
            return true;
        }else{
            return false;
            // else를 통해 false를 반환하지 않을 경우, 아무 값도 반환하지 않는
            // 경우의 수가 있기 때문에 자바에서 컴파일오류 발생
        }
    }
}
