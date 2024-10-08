package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "easbcaes";
        System.out.println(permutation(s1,s2));

    }
    public static  void permutationSolution(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f  = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutationSolution(p.substring(1),up);
        }
    }




//    LeetCode question

    public  static boolean permutation(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        int [] s1Freq = new int[26];
        int [] s2Freq = new int[26];

        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i)-'a']++;
        }

        int i = 0;
        int j = 0;

        while(j< m){

            s2Freq[s2.charAt(j) - 'a']++;
            if(j-i+1 > n){
                s2Freq[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(s1Freq,s2Freq)){
                return true;
            }
            j++;
        }
        return  false;

    }




}
