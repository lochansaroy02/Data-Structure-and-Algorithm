package Strings;

import java.util.ArrayList;
import java.util.List;

public class WordSubset {
    public static void main(String[] args) {
        String [] word1 = {"amazon","apple","facebook","google","leetcode"};
        String [] word2 = {"e","o"};
        System.out.println(wordSubset(word1, word2));
    }
    public static List<String> wordSubset(String [] word1, String [] word2) {
       List<String> ans = new ArrayList<>();
        int [] freq = new int[26];

       //maintain frequency of each character
        for(String word : word2){
            int [] temp = new  int[26];
            for(char ch : word.toCharArray()){
                temp[ch-'a']++;
                freq[ch-'a'] = Math.max(temp[ch-'a'], freq[ch-'a']);
            }
        }

        for(String word : word1){
            int [] temp = new int[26];
            for(char ch : word.toCharArray()){
                temp[ch-'a']--;

            }

            if(isSubset(freq, temp)){
                ans.add(word);
            }

        }
        return ans;
    }
    private  static  boolean isSubset(int [] freq, int [] temp){

        for (int i = 0; i< 26;i++){
            if(temp[i]< freq[i]){
                return false;
            }
        }
        return true;
    }

}
