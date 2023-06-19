package javaPractice.basicPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Automation";
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev =rev+s.charAt(i);
        }

        System.out.println("before reverse :"+ s);
        System.out.println("after reverse  :"+ rev);
    }
}
