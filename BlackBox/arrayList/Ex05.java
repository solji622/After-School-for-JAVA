package BlackBox.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static int getSurvivingIndex(int n, int k){

        ArrayList<Integer> die = new ArrayList<>();

        for (int i =1; i <= n; i++){
            die.add(i);
        }

        for (int i=1; i<=die.size(); i++){
            if (i % 3 ==0) {
                die.remove(3);
            } else {
                die.remove(i);
                die.add(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        getSurvivingIndex(8,3);
        
    }
}

/*
 전쟁에서 처참하게 패배를 겪고 돌아온 김장군, 첵임을 지기 위해 돌아온 이들에게 자결을 제안한다.
 n명의 군사들이 동그랗게 서있고, 한명씩 세어나가서 매 k번째 사람이 죽기로 한다.
 예를 들어서 8명의 군사들이 있고 매 3번째 사람마다 죽기로 하면 아래 순서로 군사들이 죽게된다.
 3 - 6 - 1 - 5 = 2 - 8 - 4 - 7
 하지만 야비한 김장군은 자신이 마지막으로 남아서 도망가려는 속셈이다.
 파라미터로 정수 n과 정수 k를 받고, 김장군이 살기 위해서 서 있어야 할 자리(int)를 리턴해주는
 메소드 getSurvivingIndex를 만드시오.
 단, arrayList를 사용할 것!

 */
