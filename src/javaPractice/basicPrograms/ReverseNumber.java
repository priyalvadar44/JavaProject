package javaPractice.basicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=123456789;
        int num=n;
        int remainder;
        int rev=0;
        while (n!=0){
            remainder=n%10;
            rev =rev*10+remainder;
            n=n/10;
        }

        System.out.println("before reverse :"+num);
        System.out.println("after reverse  :"+rev);
    }
}
