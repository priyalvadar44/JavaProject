package javaPractice.basicPrograms;

public class MissingCharacterDemo {
    public static void main(String[] args) {
        missingCharacter("abcd",1);
        missingCharacter("selenium",5);
        missingCharacter("Automation",6);

    }

    private static void missingCharacter(String s, int n) {
        String str="";
        StringBuffer sb= new StringBuffer(s);
        sb.setCharAt(n,' ');

        for (int i = 0; i <sb.length() ; i++) {
            if (!Character.isSpace(sb.charAt(i))) {
                str=str+sb.charAt(i);
            }
        }
        System.out.println(str);
    }
}
