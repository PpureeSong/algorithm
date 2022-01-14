package codeup;

import java.util.Scanner;

public class Q1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] outputs = new int[23];

        for(int i=0; i<a; i++) {
            int call = sc.nextInt();
            outputs[call-1]++;
        }

        for (int output : outputs) {
            System.out.print(output+" ");
        }

        sc.close();
    }
}
