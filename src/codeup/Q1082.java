package codeup;

import java.util.Scanner;

public class Q1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for(int i = 1; i<16; i++) {

            String num = Integer.toHexString(i).toUpperCase();

            int a = Integer.parseInt(input, 16);
            int result = a * i ;
            String str = Integer.toHexString(result).toUpperCase();
            System.out.println(input+"*"+num+"="+str);
        }

        sc.close();
    }
}
