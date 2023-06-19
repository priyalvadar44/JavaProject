package javaPractice.basicPrograms;

public class Uppercase {
    public static void main(String[] args) {
        String s="AutomationSELENIUM";
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            if (Character.isUpperCase(ch)) {

                System.out.print(ch);
            }
        }
    }
}
