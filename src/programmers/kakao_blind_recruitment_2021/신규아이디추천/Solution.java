package programmers.kakao_blind_recruitment_2021.신규아이디추천;

// Time : 60 m
public class Solution {
    public static void main(String[] args) {
        String answer = solution("z-+.^.");
        System.out.println("answer = " + answer);
    }
    public static String solution(String new_id) {
        String answer = "";

        //1
        String step1 = new_id.toLowerCase();

        //2 -_.   ~!@#$%^&*()=+[{]}:?,<>/
        String spe = "~!@#$%^&*()=+[{]}:?,<>/";

        String step2 = "";
        for(int i=0; i<new_id.length(); i++) {
            String a = step1.substring(i, i+1);
            if(!spe.contains(a)) {
                step2 += a ;
            }
        }

        System.out.println("step2 = " + step2);

        //3
        String step3 = step2.substring(0, 1);
        for(int i=1; i<step2.length(); i++) {
            String a = step2.substring(i, i+1);
            if(step3.substring(step3.length()-1).equals(".")) {
                if(!a.equals(".")) {
                    step3 += a ;
                }
            } else {
                step3 += a ;
            }
        }

        System.out.println("step3 = " + step3);

        //4-1
        String step4 = step3;
        if(step3.substring(0, 1).equals(".")) {
            step4 = step3.substring(1);
        }

        //4-2
        if(step4.length() > 1) {
            if(step4.substring(step4.length()-1).equals(".")) {
                step4 = step4.substring(0, step4.length()-1);
            }
        } else if(step4.length() == 1) {
            if(step4.equals(".")) {
                step4 = "";
            }
        }

        System.out.println("step4 = " + step4);

        //5
        String step5 = step4;
        if(step5.length() == 0) {
            step5 = "a";
        }
        System.out.println("step5 = " + step5);

        //6
        String step6 = step5;
        if(step5.length() >= 16) {
            step6 = step5.substring(0, 15);

            //6-2
            if(step6.substring(step6.length()-1).equals(".")) {
                step6 = step6.substring(0, step6.length()-1);
            }
        }
        System.out.println("step6 = " + step6);


        //7
        String step7 = step6;

        if(step6.length() == 1) {
            step7 = step6+step6+step6;
        } else if (step6.length() == 2) {
            String last = step6.substring(1);
            step7 = step6+last;

        }
        answer = step7;

        return answer;
    }
}