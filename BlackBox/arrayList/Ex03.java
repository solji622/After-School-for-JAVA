package BlackBox.arrayList;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        // 리스트 생성
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(07);
        numList.add(06);
        numList.add(22);
        numList.add(17);

        // 반복문 사용하여 출력
        for (int num : numList) {
            System.out.println(num * num);
        }
    }
}
