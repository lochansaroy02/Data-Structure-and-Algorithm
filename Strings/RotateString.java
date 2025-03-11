package Strings;

import java.util.Arrays;

public class RotateString {
    public static void main(String[] args) {
        System.out.println( isRotate("abcde","cdeab"));

        rotate("abcd");
    }

    // this approach is giving me TLE on GFG
    public static boolean rotateString(String s, String goal){

        if(s.length()!= goal.length()){return false; }
        return (s + s).contains(goal);


    }


    public static  boolean isRotate(String s1, String s2){
        if(s1.length()!= s2.length()){
            return false;
        }
        while(!s1.equals(s2)){

            rotate(s1);
        }
        return true;
    }
    public static  String rotate( String s ){
        int n = s.length();
        char ch = s.charAt(n-1);
        StringBuilder ans  = new StringBuilder();
        ans.append(ch);
        for(int i = 0 ;i< n-1; i++){
            ans.append(s.charAt(i));
        }
      return ans.toString();
    }


}
