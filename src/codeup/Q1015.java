package codeup;

import java.util.Scanner;

// String.format("%.2f", num) : 소수점 셋째자리에서 반올림해, 소숫점 이해 둘째 자리까지 출력
public class Q1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();

        System.out.println(String.format("%.2f", num));

        sc.close();
    }
}
