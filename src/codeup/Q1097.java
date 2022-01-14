package codeup;

import java.util.Scanner;

public class Q1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] baduk = new int[20][20];

        for(int i=1; i<=19; i++) {
            for(int j=1; j<=19; j++) {
                baduk[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for(int k=0; k<n; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=1; i<=19; i++) {
                if(baduk[a][i] == 0) {
                    baduk[a][i] = 1;
                } else {
                    baduk[a][i] = 0;
                }
            }
            for(int i=1; i<=19; i++) {
                if(baduk[i][b] == 0) {
                    baduk[i][b] = 1;
                } else {
                    baduk[i][b] = 0;
                }
            }
        }

        for(int i=1; i<=19; i++) {
            for (int j=1; j<=19; j++) {
                System.out.print(baduk[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
