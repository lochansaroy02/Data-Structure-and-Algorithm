package Strings;

import java.util.Arrays;

public class RotateString {
    public static void main(String[] args) {
        System.out.println( rotateString("abcde","cdeab"));

    }


    public static boolean rotateString(String s, String goal){

        if(s.length()!= goal.length()){return false; }
        return (s + s).contains(goal);

    }


}
