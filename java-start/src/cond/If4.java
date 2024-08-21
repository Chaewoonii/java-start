package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        //else if: 위 5개의 조건문을 하나로 묶음. 한 번만 실행
        if (age <= 7){
            System.out.println("미취학");
        } else if (age <= 13) { // age >= 8 &&이 생략됨. 앞선 if문을 통과했기 때문에 age가 7보다 작지 않음. 즉, 8 이상임을 만족함.
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        }else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
