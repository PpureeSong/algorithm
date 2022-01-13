package codeup;

import java.util.Scanner;

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = sc.nextInt();

        double result;

        // 비트*8 > 바이트*1024 > 킬로바이트*1024 > 메가바이트*1024 > 기가바이트

        result = h * b * c * s;
        result /= 8;   //비트 > 바이트
        result /=1024; //바이트 > 킬로바이트
        result /=1024; //킬로바이트 > 메가바이트

        System.out.println(String.format("%.1f", result)+ " MB");

        sc.close();
    }
}
