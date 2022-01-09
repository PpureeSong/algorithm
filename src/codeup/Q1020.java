package codeup;

import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] numbers = str.split("-");

        System.out.println(numbers[0]+numbers[1]);
        sc.close();
    }
}
