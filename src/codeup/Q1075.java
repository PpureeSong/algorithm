package codeup;

import java.util.Scanner;

public class Q1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while (a > 0) {
            a = a - 1;
            System.out.println(a);
        }

        sc.close();
    }
}
