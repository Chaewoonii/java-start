package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /*
        * 학점 계산하기
        * 90점 이상 A
        * 80점 이상 90점 미만 B
        * 70점 이상 80점 미만 C
        * 60점 이상 70점 미만 D
        * 60점 미만 F
        * */

        int score = 59;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
