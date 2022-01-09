package codeup;

import java.util.Scanner;

public class Q1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        String[] numbers = num.split("\\.");

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        sc.close();
    }
}
