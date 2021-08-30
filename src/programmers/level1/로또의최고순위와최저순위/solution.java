package programmers.level1.로또의최고순위와최저순위;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] answer = solution(lottos, win_nums);


        System.out.println("answer = " + answer);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        List<Integer> mine = new ArrayList<>();
        List<Integer> wins = new ArrayList<>();

        for (int lotto : lottos) {
            mine.add(lotto);
        }

        for (int win_num : win_nums) {
            wins.add(win_num);
        }

        int winCount = 0 ;
        int failCount = 0 ;
        int zeroCount = 0;

        for(int i=0; i<6; i++) {
            int a = mine.get(i);
            if(a == 0) {
                zeroCount++;
            } else if(wins.contains(a)) {
                winCount++;
            } else {
                failCount++;
            }
        }

        int max = winCount + zeroCount;
        int min = winCount;

        answer[0] = level(max);
        answer[1] = level(min);


        return answer;
    }

    public static int level(int a) {
        switch(a) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            case 1:
            case 0:
                return 6;
        }
        return 6;
    }
}
