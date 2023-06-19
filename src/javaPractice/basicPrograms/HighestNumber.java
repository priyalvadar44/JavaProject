package javaPractice.basicPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HighestNumber {

    public static void main(String[] args) {

        int [] a={12,45,76,15,18,14};
        HashMap<Integer,Integer> hashMap =new HashMap();

        for (int i = 0; i <a.length ; i++) {
            hashMap.put(i,a[i]);
        }

        int maxNum= Collections.max(hashMap.values());
        System.out.println(maxNum);

        int minNum = Collections.min(hashMap.values());
        System.out.println(minNum);


    }
}
