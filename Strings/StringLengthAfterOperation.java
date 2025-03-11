package Strings;

import java.util.HashMap;

public class StringLengthAfterOperation {
    public static void main(String[] args) {
        System.out.println(   operation2("aabbbcbbbbbccc"));
    }
    public static  int operations(String s){
        int count = 0;

        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }else{
                mp.put(ch, 1);
            }
        }

        for(char ch : s.toCharArray()){
            if(mp.get(ch)> 2){
                if(mp.get(ch)%2== 0) {
                    count = count + 2;
                }else{
                    count++;
                }
            }
        }
        System.out.println(mp);
        return count;
    }
    public static  int operation2(String s){
        int count = 0;
        int [] freq = new int[26];

        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2==0){
                count+=2;
            }else{
                count+=1;
            }
        }
        return count;
    }
}
