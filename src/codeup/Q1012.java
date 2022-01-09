package codeup;

import java.util.Scanner;

// String.format("%f", num) : %f 실수형 그대로 출력
public class Q1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();
        System.out.println(String.format("%f", num));
        sc.close();
    }
}
