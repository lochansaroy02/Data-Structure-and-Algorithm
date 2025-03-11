package Strings;

public class MakeStringSubSequance {
    public static void main(String[] args) {
        System.out.println(makeSubSequence("zc", "ad"));
    }
    public static  boolean makeSubSequence( String s1 , String s2){

        int i = 0;
        int j = 0;
         while(i< s1.length() && j < s2.length()){
             if(s1.charAt(i)== s2.charAt(j) ||
                 s1.charAt(i)+1== s2.charAt(j) ||
                     s1.charAt(i)-25 == s2.charAt(j)
             ) {
                 j++;
             }
             i++;
         }
         return j==s2.length();
    }
}
