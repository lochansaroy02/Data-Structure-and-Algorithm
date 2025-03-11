package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    }
    public static ArrayList<ArrayList<String>>  anagram(String [] words){


        HashMap<String , ArrayList<String> > mp = new HashMap<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();


        for(String s: words){
            char [] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedSTR = new String(charArr);

            mp.putIfAbsent(sortedSTR, new ArrayList<>());
            mp.get(sortedSTR).add(s);

        }
        return ans;


    }
}
