package class1;

/**
 * 배열로 수정
 *  예를들어 데이터 제거시에는 정확한 인덱스에 내용을 제거해야 하기에 이또한 좋은 방법은 아님
 *  실수를 유발 <-- 이게 제일 문제
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생2"};
        int[] studentAges = {15,16};
        int[] studentGrade = {90,80};

        for(int i=0;i<studentNames.length;i++){
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }

    }
}
