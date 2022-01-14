package codeup;

import java.util.Scanner;

public class Q1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] result = new int[h+1][w+1];

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(d==0) {
                for(int j=y; j<y+l; j++) {
                    result[x][j] = 1;
                }
            } else {
                for(int j=x; j<x+l; j++) {
                    result[j][y] = 1;
                }
            }
        }

        for(int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
