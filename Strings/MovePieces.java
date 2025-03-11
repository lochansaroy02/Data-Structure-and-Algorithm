package Strings;

import java.util.*;

public class MovePieces {
    public static void main(String[] args) {

    }
//    brute force approach (Recursion )
    public static  boolean canChange(String start , String target){
        int n = start.length();
        Map<String, Boolean> mp = new HashMap<>();
        return solve(start, target, mp);


    }
    public  static  boolean solve(String start , String target , Map<String ,Boolean > mp){
        if(start.equals(target)){
            return true;
        }
        if(mp.containsKey(start)){
            return mp.get(start);
        }

        for(int i = 0; i < start.length(); i++){
            // Swap L _
            if( start.charAt(i) == 'L' && i > 0  && start.charAt(i-1)=='_'){
                String swapped =  swap(start, i , i-1);
                if(solve(swapped, target ,mp )){
                    return true;
                }
            }
            else if( start.charAt(i) == 'R' && i < start.length()-1  && start.charAt(i+1)=='_'){
                String swapped =  swap(start, i , i+1);
                if(solve(swapped, target ,mp )){
                    return true;
                }
            }
        }
        mp.put(start, false);
        return false;
    }
    private static  String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }


    // Approach 2 : Optimal solution using two pointer

    public  static  boolean canChange2( String start , String target ){
        int n = start.length();
        int i= 0;
        int j =0;

        while(i < n ||  j < n){
            while (i < n && start.charAt(i)== '_'){
                i++;
            }
            while (i < n && target.charAt(j)== '_'){
                j++;
            }

            if( i == n || j == n){
                return  i == n && j == n;
            }
            if(start.charAt(i)!= target.charAt(j)){
                return false;
            }

            if(start.charAt(i) == 'L' &&  i < j){
                return false;
            }
            if(start.charAt(i) == 'R' &&  i > j){
                return false;
            }

            i++;
            j++;
        }

        return true;

    }
}
