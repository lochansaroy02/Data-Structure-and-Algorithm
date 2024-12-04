package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }
    public  static  boolean canConstruct(String note, String mag){
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();
        for (int i = 0; i < note.length(); i++) {
            char ch = note.charAt(i);
            noteMap.put(ch, noteMap.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < mag.length(); i++) {
            char ch = mag.charAt(i);
            magMap.put(ch, magMap.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : noteMap.entrySet()) {
            char ch = entry.getKey();
            int noteFreq = entry.getValue();
            int magFreq = magMap.getOrDefault(ch, 0);

            // If the frequency of any character in noteMap exceeds magMap, return false
            if (noteFreq > magFreq) {
                return false;
            }
        }

        return true;



    }
    public  static  boolean isIsomorphic(String s, String t){
        if(s.length()!= t.length()){
            return false;
        }


        HashMap<Character, Integer> tmp = new HashMap<>();
        HashMap<Character, Integer> smp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            tmp.put(ch, tmp.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);
            smp.put(ch, smp.getOrDefault(ch, 0)+1);
        }


        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);





        }


        return true;

        }




}
