package javaPractice.interviewCodingQuestions;

public class ReplaceCharWithStar {
    public static void main(String[] args) {
        String s="123456789987654321";
        StringBuffer sb= new StringBuffer(s);

        for (int i = 5; i <sb.length()-4 ; i++) {
            sb.setCharAt(i,'*');
        }
        System.out.println(sb);

    }
}
