package Arrays;

import java.util.HashMap;

public class CountAndSay {
    public static void main(String[] args) {
            String s = "1322444992882832336";
            countAndSay(s);

    }
    public static  void countAndSay( String s){
        HashMap< Character, Integer> mp = new HashMap<>();
        for( char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);

            }else{
                mp.put(ch, 1);
            }
        }
        for (char ch : s.toCharArray()){
            int freq  = mp.get(ch);
            System.out.println(freq);
        }
        System.out.println(mp);
    }
}
