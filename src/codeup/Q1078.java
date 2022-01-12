package codeup;

import java.util.Scanner;

public class Q1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=a; i++) {
            if(i%2 ==0) {
                sum += i;
            }
        }

        System.out.println(sum);


        sc.close();
    }
}
