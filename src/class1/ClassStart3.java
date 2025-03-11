package class1;

/**
 * 타입은 데이터의 종류나 형태를 나타냄
 * 클래스를 타입으로 생성
 * 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 함
 *
 * 참조값을 변수에 보관하는 이유
 * ->객체를 생성하는 것은 문제 없지만
 *  생성한 객체에 접근할 수 있는 방법이 필요하기 떄문이다
 *
 *
 *  ex)
 *  Student student1 = new Student() // 1. Student 객체 생성
 *  Student student1 = x001 // 2.Student()의 결과로  x001 참조값 반환
 *  student1 = x001 // 3. 촤종결과
 *  
 */
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name= "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[]{student1,student2};

        System.out.println("이름:" + student1.name + "나이:" + student1.age + "성적:" + student1.grade);
        System.out.println("이름:" + student2.name + "나이:" + student2.age + "성적:" + student2.grade);

        //서로 다른 객체임을 증명
        System.out.println("student1객체: " + student1);
        System.out.println("student2객체: " + student2);


        //향상된 for문을 통한 최적화
        for (Student s : students) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);

        }
    }
}
