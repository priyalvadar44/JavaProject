package javaPractice.map;

import java.util.HashMap;

public class DuplicateKey {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap =new HashMap<Integer,String>();
        hashMap.put(1,"abc");
        hashMap.put(1,"xyz");
        hashMap.put(2,"xyz");
        System.out.println(hashMap);



    }
}
