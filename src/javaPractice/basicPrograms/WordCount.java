package javaPractice.basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String s="good bad to much good bad is good";
        HashMap<String,Integer> hashMap =new HashMap<String,Integer>();

        String[] str =s.split(" ");
        for (int i = 0; i <str.length ; i++) {
            if (hashMap.containsKey(str[i])) {
                hashMap.put(str[i], hashMap.get(str[i])+1);
            }
            else {
                hashMap.put(str[i], 1);
            }
        }
        System.out.println(hashMap);

        System.out.println("________________________________________________________________");

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("________________________________________________________________");

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() >1) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

        }

        System.out.println("________________________________________________________________");
    }
}
