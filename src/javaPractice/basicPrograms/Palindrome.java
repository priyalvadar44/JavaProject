package javaPractice.basicPrograms;

public class Palindrome {
    public static void main(String[] args) {
        String s ="nitin";
        String rev= "";

        for (int i = 0; i < s.length(); i++) {
            rev= rev+s.charAt(i);
        }



        if (rev.equals(s) ) {
            System.out.println("string is palindrome");
        }
        else
            System.out.println("String is not palindrome");
    }
}
