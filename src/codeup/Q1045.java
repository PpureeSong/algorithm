package codeup;

import java.util.Scanner;

public class Q1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b = sc.nextLong();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(String.format("%.2f",(float)a/b));

        sc.close();
    }
}
