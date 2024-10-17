package Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
    public  static  boolean isSubsequence(String s, String t){
        int i  = 0;
        int j = 0;
        while(i<s.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;

            }
            j++;
        }

        return true;
    }

}
