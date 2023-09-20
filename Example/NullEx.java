package classExample;

public class nullEx {
//    자바에서의 null = 비어있음
//    단, null은 참조형 변수만 가질 수 있는 것임.

    public static void main(String[] args) {
//        Person p1 = null;
//        System.out.println(p1);
//        p1.getName();
//        만약 null을 보관하고 있는 변수의 메소드를 호출하면
//        nullPointerException 이라는 오류가 발생한다.

        Person[] peoples  = new Person[5];
        peoples[0] = new Person("홍길동",52);
        peoples[2] = new Person("장발장",29);
        peoples[3] = new Person("임꺽정",66);

        for (int i=0; i<peoples.length; i++){
            Person p = peoples[i];
            if (p != null) {
                System.out.println(p.getName());
            } else {
                System.out.println(i +"번 자리는 비어있습니다.");
            }
        }
    }
}
