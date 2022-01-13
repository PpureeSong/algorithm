package codeup;

import java.util.Scanner;

public class Q1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        double result = (double)w*h*b;
        result /= 8;
        result /= 1024;
        result /= 1024;

        System.out.println(String.format("%.2f", result)+ " MB");


        sc.close();
    }
}
