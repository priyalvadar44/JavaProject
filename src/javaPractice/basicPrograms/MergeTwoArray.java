package javaPractice.basicPrograms;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] a ={12,25,18,65,18,16,98};
        int [] b ={15,14,18,16,17,15,123};
        int [] merge =new int[a.length+b.length];

        for (int i = 0; i <a.length ; i++) {
            merge[i]=a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            merge[i+a.length]=b[i];
        }

        System.out.println(Arrays.toString(merge));
    }
}
