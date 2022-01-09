package codeup;

import java.util.Scanner;

public class Q1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;

        System.out.println(sum);
        System.out.println(String.format("%.1f", sum/3.0));

        sc.close();
    }
}
