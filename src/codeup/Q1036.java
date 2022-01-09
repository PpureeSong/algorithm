package codeup;

import java.util.Scanner;

// 문자(char) > 숫자(int) : 아스키코드
public class Q1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println((int)word.charAt(0));

        sc.close();
    }
}
