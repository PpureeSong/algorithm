package codeup;

import java.util.Scanner;

public class Q1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] box = new int[11][11];

        for(int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                box[i][j] = sc.nextInt();
            }
        }

        // 시작 (2,2)
        // 오른쪽으로 움직일때 : x는 그대로 y만 증가
        // 아래쪽으로 움직일때 : y는 그대로 x만 증가
        // 0 갈 수 있는곳, 1 벽, 2 먹이
        // 종료 가장 오른쪽에 도착, 더이상 움직일 수 없는 경우, 먹이(2)를 찾은 경우


        // 기준의 오른쪽 확인 > 0이면 이동, 9로 바꿈. > 1이면 아래 확인. > 아래가 0이면 이동, 9로 바꿈
        //
        int x = 2;
        int y = 2;

        if(box[x][y] == 2) {
            box[x][y] = 9;
        } else {
            box[x][y] = 9;
            while (true) {
                if(box[x][y+1] == 2) {
                    y++;
                    box[x][y] = 9;
                    break;
                }

                if(box[x][y+1] == 0) {
                    y++;
                    box[x][y] = 9;
                    continue;
                }

                if(box[x][y+1] == 1) {
                    if(box[x+1][y]  == 2) {
                        x++;
                        box[x][y] = 9;
                        break;
                    }

                    if(box[x+1][y] == 0) {
                        x++;
                        box[x][y] = 9;
                        continue;
                    }

                    if(box[x+1][y] == 1) {
                        break;
                    }
                }

            }

        }



        for(int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
