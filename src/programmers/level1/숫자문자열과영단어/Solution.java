package programmers.level1.숫자문자열과영단어;

public class Solution {

    public static void main(String[] args) {

        int answer = solution("one4seveneight");

        System.out.println("answer = " + answer);

    }

    public static int solution(String s) {
        int answer = 0;

        String str = s.replaceAll("zero" , "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9");

        answer = Integer.parseInt(str);
        return answer;
    }
}
