package codeup;

import java.util.Scanner;

public class Q1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] baduk = new int[20][20];

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            baduk[a][b] = 1;
        }

        for(int i=1; i<=19; i++) {
            for(int j=1; j<=19; j++) {
                System.out.print(baduk[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
