package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화, new Int[] 생략 가능

        //변수값 사용, .length: 배열의 길이
        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
