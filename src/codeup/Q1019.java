package codeup;

import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split("\\.");

        int y = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);

        System.out.println(String.format("%04d.%02d.%02d", y, m, d));

        sc.close();
    }
}
