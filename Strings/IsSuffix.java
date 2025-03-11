package Strings;

import java.util.Objects;

public class IsSuffix {
    public static void main(String[] args) {
        String [] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));

//        System.out.println(isPrefix("dcabba", "abba"));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length ; i++) {
            for (int j = 0; j < words.length ; j++) {
                if(!Objects.equals(words[i], words[j]) && i< j){
                    if( isPrefix(words[i], words[j]) && isSuffix(words[i], words[j])){
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public  static  boolean isSuffix( String word, String s){
        int i = 0;
        int j = 0 ;
        while(j < s.length()){
            char ch1 = word.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
    public  static  boolean isPrefix( String word, String s){
        int i = word.length()-1;
        int j = s.length()-1 ;
        while(j > 0){
            char ch1 = word.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i--;
            j--;
        }

        return true;
    }
}
