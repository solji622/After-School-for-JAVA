package BlackBox;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지: java 클래스들을 비슷한 것들끼리 정리해주는 하나의 폴더

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수: " + random.nextInt()); // int의 범위 내에서 정수값 반환
        System.out.println("랜덤 정수(범위 지정): " + random.nextInt(10)); // 0부터 9까지
        System.out.println("랜덤 실수: " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수값 반환
        System.out.println("랜덤 실수(범위 지정): " + random.nextDouble(10.0));

        // 5.0 이상 10.0 이상의 실수를 뽑으려면?
        System.out.println("랜덤 실수(5.0~10.0): " + random.nextDouble(5.0,10.0));

        // 로또 번호 뽑기(1 ~ 45)
        System.out.println("로또 번호: " + random.nextInt(1,46));

        // Math, Scanner, StringButter, String Builder, ...
        // Biginteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, ...
    }
}
