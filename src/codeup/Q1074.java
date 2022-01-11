package codeup;

import java.util.Scanner;

public class Q1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a > 0) {
            System.out.println(a);
            a = a - 1;
        }

        sc.close();
    }
}
