package javaPractice.map;

import java.util.HashMap;

public class HashMapKey {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap =new HashMap<Integer,String>();
        hashMap.put(1, "abc");
        hashMap.put(1, "cvbnm,");
        System.out.println(hashMap);

    }
}
