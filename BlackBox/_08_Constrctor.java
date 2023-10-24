package BlackBox;

public class _08_Constrctor {
    public static void main(String[] args) {
        // 생성자 : 객체가 만들어질 때 자동으로 호출되는 메소드
        // 대문자로 시작하고 클래스 이름과 동일함

        BlackBox b1 = new BlackBox(); // BlackBox() == 생성자
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox("하양이","UHD",400000,"흰색");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);

        BlackBox b3 = new BlackBox("까망이2","UHD",350000);
        System.out.println(b3.color);
    }
}
