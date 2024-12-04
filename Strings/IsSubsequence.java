package Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    //Approach 1: Two Pointers

    public  static  boolean isSubsequence(String s, String t){
        int i  = 0;
        int j = 0;
        if(s.length() > t.length()){
            return false;
        }
        while(i < s.length() && j<  t.length()){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1== ch2){
                i++;
            }
            j++;
        }

        return i==s.length();
    }



}
