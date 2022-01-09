package codeup;

import java.util.Scanner;

public class Q1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String[] str = word.split("");

        for (String s : str) {
            System.out.println("'"+s+"'");
        }

        sc.close();
    }
}
