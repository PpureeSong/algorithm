package methods.문자열.문자열자르기;

// 특정 위치 기준으로 문자열 자르기
// 1. substring(beginIndex); beginIndex부터 끝까지의 문자열
// 2. substring(beginIndex, endIndex); beginIndex(포함) 부터 endIndex(불포함)까지 문자열
// * StringIndexOutOfBoundsException 나지 않도록 길이 확인 주의! (음수, length 이상 안됨 )
public class Substring {

    public static void main(String[] args) {

        String str = "Hello java substring!";
        String str2 = "abc@tistory.com";

        /**
         *  substring(beginIndex);
         *    beginIndex부터 끝까지의 문자열
         */
        String substring1 = str.substring(1);

        /**
         * 1. 뒤에서 몇글자만 자르고 싶은 경우 (마지막 n개의 문자열)
         * substring(str.length() - n);
         * substring(str.length()); 빈 문자열
         */
        String last = str.substring(str.length()-1);
        String empty = str.substring(str.length());


        /**
         * 2. 특정 문자열이 나오는 위치부터 자르고 싶은 경우
         * indexOf(); 특정 문자열이 처음 나오는 index를 리턴, 존재하지 않으면 -1 리턴
         * lastIndexOf() 특정 문자열이 마지막으로 나오는 index를 리턴, 존재하지 않으면 -1 리턴
         */
        int index = str2.indexOf("@");

        // @ 앞부분
        String frontStr = str2.substring(0, index);
        // @ 뒷부분
        String backStr = str2.substring(index+1);


        /**
         * substring(beginIndex, endIndex);
         *  beginIndex(포함) 부터 endIndex(불포함)까지 문자열 리턴 = beginIndex부터 endIndex전까지
         *  beginIndex부터 (endIndex - beginIndex)자리 만큼 출력
         */
        String substring2 = str.substring(6, 10); // 6부터 시작해서 4자리(10-6)만큼 출력 : java

        /**
         * str.substring(1); 가 같은 결과
         * 1부터 마지막 문자열까지를 잘라서 리턴
         */
        String substring3 = str.substring(1, str.length());


        System.out.println("substring1 = " + substring1);
        System.out.println("substring2 = " + substring2);

        System.out.println("last = " + last);
        System.out.println("empty = " + empty);

        System.out.println("frontStr = " + frontStr);
        System.out.println("backStr = " + backStr);

        System.out.println("substring3 = " + substring3 + ", substring1 == substring3 : " + substring1.equals(substring3));
    }

}
