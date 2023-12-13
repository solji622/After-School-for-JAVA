package afterschool;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> People = new ArrayList<>();

        People.add(new Student(3,"김회장","여","010-1234-1234"));
        People.add(new Student(3,"이총무","남","010-1234-5678"));
        People.add(new Student(2,"유부장","남","010-5678-5678"));
        People.add(new Student(1,"최신입","여"));

        for(int i=0; i < People.size(); i++){
            Student Student = People.get(i);
            Student.studentInfo();
        }

        System.out.println("2023학년도 학생현황");
        for(Student Student : People){
            Student.studentInfo();
        }




        System.out.println("2024학년도 학생현황");
        for(Student Student : People){
            Student.studentInfo();
        }

    }



}
