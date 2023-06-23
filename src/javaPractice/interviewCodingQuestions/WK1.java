package javaPractice.interviewCodingQuestions;

public class WK1 {
    public static void main(String[] args) {
        String s="Total 1000 2000 3000 Date";
        String str="";
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isDigit(s.charAt(i) )|| Character.isSpace(s.charAt(i))) {
                str =str+s.charAt(i);
            }
        }
        System.out.println(str);
        System.out.println("_________________________________________________________");

        String strTrim= str.trim();
        System.out.println(strTrim);
        System.out.println("__________________________________________________________");

        String [] strArr =strTrim.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        System.out.println("__________________________________________________________");
    }
}
