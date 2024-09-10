package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);

        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
        // changeNumber에 num1의 값을 전달할 때 '복사해서' 전달하기 때문에 num1의 값은 변경되지 않는다.
        // num1의 값을 읽어 '복사하여' num2로 전달하는 것.
        // num2의 스코프는 changeNumber 코드블럭 이내이며, num1의 값과는 아무런 상관이 없다.
        // num2의 값을 변경하더라도 num1에는 아무런 영향을 주지 않는다~!
    }

    public static void changeNumber(int num2){
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}
