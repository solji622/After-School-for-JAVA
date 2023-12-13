package afterschool;

public class Student {
    private int grade;
    private String name;
    private String gender;
    private String phone;

    public Student(int grade, String name, String gender, String phone) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(int grade, String name, String gender) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <= 3){
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void studentInfo(){
        if(phone == null){
            phone = "없음";
            System.out.println(name+"학생은 "+grade+"학년이며, 성별은 "+gender+", 전화번호는 "+phone+"입니다.");
        } else {
            System.out.println(name+"학생은 "+grade+"학년이며, 성별은 "+gender+", 전화번호는 "+phone+"입니다.");
        }
    }

    public void upGrade(){
        grade+=1;
    }

}
