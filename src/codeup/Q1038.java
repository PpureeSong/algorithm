package codeup;

import java.util.Scanner;

public class Q1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        System.out.println(Long.parseLong(inputs[0])+Long.parseLong(inputs[1]));

        sc.close();
    }
}
