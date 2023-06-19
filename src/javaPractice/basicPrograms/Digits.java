package javaPractice.basicPrograms;

public class Digits {
    public static void main(String[] args) {
        String s="Automation123456Selenium";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
    }
}
