package javaPractice.map;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountOnly {
    public static void main(String[] args) {
        String s="Automation12345Selenium";

        HashMap<Character,Integer> hashMap =new HashMap<Character,Integer>();

        for (int i = 0; i <s.length() ; i++) {
            char ch= s.charAt(i);
            if (!Character.isDigit(ch)) {


                if (hashMap.containsKey(ch)) {
                    hashMap.put(ch, hashMap.get(ch) + 1);
                } else {
                    hashMap.put(ch, 1);
                }

            }
        }
        System.out.println(hashMap);

        for (Map.Entry entry: hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
