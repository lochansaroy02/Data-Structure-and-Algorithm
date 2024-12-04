package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String t = "abba";
        wordPattern(t,s);
    }
    public static void  wordPattern(String pattern , String s){
        HashMap<String, Integer> strMap = new HashMap<>();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (String word : s.split(" ")) {
            if (strMap.containsKey(word)) {
                strMap.put(word, strMap.get(word)+1);
            }else {
                strMap.put(word,1);
            }
        }


        for (char ch : pattern.toCharArray()) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch)+1);
            }else {
                charMap.put(ch,1);
            }
        }

        System.out.println(strMap);
        System.out.println(charMap);

    }
}
