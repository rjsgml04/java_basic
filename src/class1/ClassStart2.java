package class1;

/**
 *  학생이 늘어날때마다 변수를 추가로 선언해야하는 문제 발생
 *  -> 일단은 배열을 통해 문제를 해결해보는 과정으로 진행
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + "나이:" + student1Age + "성적:" + student1Grade);
        System.out.println("이름:" + student2Name + "나이:" + student2Age + "성적:" + student2Grade);

    }
}
