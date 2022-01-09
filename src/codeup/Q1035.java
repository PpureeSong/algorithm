package codeup;

import java.util.Scanner;

public class Q1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine(), 16);

        System.out.println(Integer.toOctalString(num));

        sc.close();
    }
}
