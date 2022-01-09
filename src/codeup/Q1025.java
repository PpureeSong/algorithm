package codeup;

import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strs = str.split("");

        System.out.println("["+strs[0]+"0000]");
        System.out.println("["+strs[1]+"000]");
        System.out.println("["+strs[2]+"00]");
        System.out.println("["+strs[3]+"0]");
        System.out.println("["+strs[4]+"]");

        sc.close();
    }
}
