package javaPractice.interviewCodingQuestions;

public class WK2 {
    public static void main(String[] args) {
        String s="Total 1000 2000 3000 Date";
        String strReplace = s.replaceAll("[^0-9]"," ");

        System.out.println(strReplace);

        String strTrim = strReplace.trim();

        System.out.println(strTrim);

        String [] strArr = strTrim.split(" ");

        for (int i = 0; i <strArr.length ; i++) {
            System.out.println(strArr[i]);
        }
    }
}
