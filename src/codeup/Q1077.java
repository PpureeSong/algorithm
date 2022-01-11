package codeup;

import java.util.Scanner;

public class Q1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int num = 0;

        while (num <= input) {
            System.out.println(num);
            num++;
        }

        sc.close();
    }
}
