package codeup;

import java.util.Scanner;

public class Q1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(a + d*(n-1));

        sc.close();
    }
}
