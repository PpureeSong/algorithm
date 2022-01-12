package codeup;

import java.util.Scanner;

public class Q1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt(); //3

        int sum = 0;
        int count = 0;

        while(sum < input) {
            count ++;
            sum += count;
        }

        System.out.println(count);

        sc.close();
    }
}
