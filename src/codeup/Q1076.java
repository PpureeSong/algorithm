package codeup;

import java.util.Scanner;

public class Q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.nextLine().charAt(0);

        char start = 'a';

        while (start < input) {
            System.out.print(start +" ");
            start = (char)(start+1);
        }

        System.out.print(input);

        sc.close();
    }
}
