package javaPractice.basicPrograms;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] a ={12,451,24,16,34,89,57};
        int temp=0;

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] >a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));
    }
}
