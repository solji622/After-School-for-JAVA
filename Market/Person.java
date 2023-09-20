package classExample;

public class Person {

    // final 사용 시 setter는 삭제 (private 대신 public도 사용 가능)
    public final String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        System.out.println(p1.getName());
    }



}
