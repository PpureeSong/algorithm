package codeup;

import java.util.Scanner;

public class Q1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split("\\.");

        int y = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int d = Integer.parseInt(inputs[2]);

        System.out.println(String.format("%02d-%02d-%04d", d, m, y));

        sc.close();
    }
}
