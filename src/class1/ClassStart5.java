package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002 Student의 참조값을 담음
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(Student student : students){
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" +student.grade);

        }

    }
}
