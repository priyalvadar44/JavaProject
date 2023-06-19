package javaPractice.basicPrograms;

public class Vowels {
    public static void main(String[] args) {

        String s ="AutomationSeleniun";
        int vCnt=0;

        for (int i = 0; i <s.length(); i++) {
            char ch= s.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||
                    ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {

                System.out.print(ch+" ,");
                vCnt++;
            }
        }
        System.out.println();
        System.out.println("Vowels Count :"+vCnt);

    }


}
