package javaPractice.interviewCodingQuestions;

public class ReplaceCharWithStar2 {
    public static void main(String[] args) {
        String s="123456789987654321";
        char [] ch = s.toCharArray();

        for (int i = 0; i < s.length() ; i++) {
            if (i>4 && i<s.length()-4) {
                ch[i]='*';
            }

        }
        String str = new String(ch);
        System.out.println(str);
    }
}
