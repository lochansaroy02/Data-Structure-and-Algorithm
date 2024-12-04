package Strings;

import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbccc";
        System.out.println(nonRepeatingChar(s));
    }
    public  static char nonRepeatingChar(String s){
        HashMap<Character, Integer>  mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }else{
                mp.put(ch, 1);
            }
        }
        System.out.println(mp);

       for(char ch  : s.toCharArray()){
           if(mp.get(ch)== 1){
               return ch;
           }
       }
       return '$';
    }
}
