package BlackBox.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        // 리스트 생성
        ArrayList<String> nameList = new ArrayList<String>();
        System.out.println(nameList.isEmpty());
        nameList.add("홍길동");
        nameList.add("홍길순");
        nameList.add("장발장");
        nameList.add("로미오");
        nameList.add("줄리엣");

        // 메소드 사용해보기
        System.out.println(nameList.size()); // 갯수 반환
        System.out.println(nameList.get(3));
        System.out.println(nameList);
        String removeValue = nameList.remove(2); // index가 삭제되면서 뒤의 index가 당겨짐
        System.out.println(nameList);
        System.out.println(nameList.get(2));
        System.out.println(removeValue); // 삭제된 값 반환

        // 반복문 사용하여 출력(for - each 문)
        for (String name : nameList){
            System.out.println(name);
        }

        //
    }
}
