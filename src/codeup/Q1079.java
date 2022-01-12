package codeup;

import java.util.Scanner;

public class Q1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String str = sc.next();
            System.out.println(str);

            if ( str.equals("q")) {
                break;
            }
        }
        sc.close();
    }
}
