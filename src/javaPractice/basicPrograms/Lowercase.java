package javaPractice.basicPrograms;

public class Lowercase {
    public static void main(String[] args) {
        String s="AutomationSELENIUM";
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch);
            }
        }
    }
}
