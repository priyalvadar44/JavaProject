package javaPractice.interviewCodingQuestions;

public class SwapPair {
    public static void main(String[] args) {
        String s="Priyal Vadar";
        char temp;
        char [] ch=s.toCharArray();
        for (int i = 0; i <s.length(); i=i+2) {
            temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;

        }

        String str= new String(ch);
        System.out.println(str);
    }
}
