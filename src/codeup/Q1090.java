package codeup;

import java.util.Scanner;

public class Q1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        long result = a;

        for(int i=1; i<n; i++) {
            result *= (long) r;
        }

        System.out.println(result);

        sc.close();
    }
}
