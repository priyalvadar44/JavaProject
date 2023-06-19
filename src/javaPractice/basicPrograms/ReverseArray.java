package javaPractice.basicPrograms;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] a={12,45,78,26,956,156,147,357,158,1};

        System.out.println(Arrays.toString(a));

        int start=0;
        int end =a.length-1;
        int temp=0;
        while (start<end){
             temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));

    }
}
