package methods.문자열.문자열자르기;

// 특정 문자를 기준으로 문자열 잘라서 배열로 리턴
// 문자열배열 = 대상문자열.split("기준문자");
public class Split {

    public static void main(String[] args) {
        //1. 쉼표(,)로 문자열 잘라서 배열에 넣기
        String str = "A,B,C,D";
        String[] array = str.split(",");

        for (String s : array) {
            System.out.println("s = " + s);
        }

        //2. 공백(" ")으로 문자열 잘라서 배열에 넣기
        String str2 = "동해물과 백두산이 마르고 닳도록 하나님이 보우하사 우리나라 만세";
        String[] array2 = str2.split(" ");

        for (String s : array2) {
            System.out.println("s = " + s);
        }

    }

}
