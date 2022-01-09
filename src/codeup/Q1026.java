package codeup;

import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] clock = sc.nextLine().split(":");
        System.out.println(Integer.parseInt(clock[1]));
        sc.close();
    }
}
