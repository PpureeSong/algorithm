package codeup;

import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] call = new int[a];

        for(int i=0; i<a; i++) {
            int num = sc.nextInt();
            call[i] = num;
        }

        for(int i=a-1; i>=0; i--) {
            System.out.print(call[i]+" ");
        }

        sc.close();
    }
}
