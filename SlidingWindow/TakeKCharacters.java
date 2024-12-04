package SlidingWindow;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.HashMap;

public class TakeKCharacters {
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
            String s = "aabbbccdddee";

    }
    //Recursion
    public static  void solve(String s, int k, int i, int j, int minutes , int[] count){
        if(count[0]>=k  && count[1]>=k && count[2]>=k){
            result = Math.min(result,  minutes);
            return;
        }

        if(i> j){
            return;
        }

        // Delete from left
        int[] tempFreqLeft = new int[3];
        tempFreqLeft = count;
//        tempFreqLeft[s.charAt(i)-'a']+1;

    }
    public  static  int recursion( String s, int k ){
        int [] count = new int[3];
        Arrays.fill(count, 0);
        int i = 0;
        int j = s.length()-1;
        int minutes = 0;
        solve( s, k ,i,j , minutes, count );
        return result;
    }

    public static  void takeKChar(String s , int k){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char num:s.toCharArray() ){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }

}
