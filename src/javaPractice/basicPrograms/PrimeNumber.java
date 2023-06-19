package javaPractice.basicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("enter any number :");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {

        if (n <=1) {
           return false ;
        }
        else {
            for (int i = 2; i < n/2; i++) {
                if (n%i==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
