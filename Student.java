import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
   float marks;
   String rollNo;
   float percentage;
}
class main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student();
        st1.marks = 85.5f;
        st1.rollNo = "A123";
        st1.percentage = 85.5f;
        students.add(st1);
        Student st2= new Student();
        st2.marks = 90.0f;  
        st2.rollNo = "B456";
        st2.percentage = 90.0f;
        students.add(st2);
        Student st3= new Student();
        st3.marks = 78.0f;
        st3.rollNo = "C789";
        st3.percentage = 78.0f;
        students.add(st3);

        System.out.println("Student Roll No: " + st1.rollNo);
        System.out.println("Student Marks: " + st1.marks);
        System.out.println("Student Percentage: " + st1.percentage);
        System.out.println("Student Roll No: " + st2.rollNo);
        System.out.println("Student Marks: " + st2.marks);  
        System.out.println("Student Percentage: " + st2.percentage);
        System.out.println("Student Roll No: " + st3.rollNo);
        System.out.println("Student Marks: " + st3.marks);  
        System.out.println("Student Percentage: " + st3.percentage);
    }
}
