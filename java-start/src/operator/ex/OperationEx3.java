package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        /*
        * int형 변수 score를 선언
        * score가 80점 이상이고, 100점 이하면 true, 아니면 false를 출력
        * */

        int score = 105
                ;
        boolean result = 80 <= score && score <= 100;
        System.out.println(result);
    }
}
