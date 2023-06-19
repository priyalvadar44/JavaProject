package javaPractice.basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {

        String s= "123Selenium123Automation123";

        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
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
