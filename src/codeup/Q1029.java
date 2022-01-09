package codeup;

import java.util.Scanner;

public class Q1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        System.out.println(String.format("%.11f", Double.parseDouble(num)));

        sc.close();
    }
}
