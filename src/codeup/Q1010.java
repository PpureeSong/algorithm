package codeup;

import java.util.Scanner;

// 입력받기
// import java.util.Scanner
// Scanner sc = new Scanner(System.in); 것
// sc라는 Scanner 객체를 생성하여 System.in으로 입력한 값을 바이트 단위로 읽는
// next(자료형)() : 자료형에 따라 입력 받기
// nextLine() : 한줄씩 받음
// next() : 스페이스 기준 한 단어
public class Q1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
        sc.close();
    }
}
