package codeup;

import java.util.Scanner;

public class Q1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int sum = 0;
        int i = 0;

        while (sum < input) {
            i++;
            sum += i;
        }

        System.out.println(sum);

        sc.close();
    }
}
