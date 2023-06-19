package javaPractice.interviewCodingQuestions;

public class ReplaceCharWithStar1 {
    public static void main(String[] args) {
        String s="123456789987654321";
        StringBuffer sb= new StringBuffer(s);

        for (int i = 0; i <sb.length() ; i++) {
            if (i>4 && i<sb.length()-4) {
                sb.setCharAt(i,'*');
            }

        }
        System.out.println(sb);

    }
}
