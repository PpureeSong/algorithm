package codeup;

import java.util.Scanner;

public class Q1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b = sc.nextLong();

        System.out.println(a%b);
        sc.close();
    }
}
