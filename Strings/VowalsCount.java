package Strings;

public class VowalsCount {
    public static void main(String[] args) {
        System.out.println(vowalCount("leetcode"));
    }
    public static  String vowalCount(String s){

        int count = 0;
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                mask|=(1<<(ch-'a'));
            }
        }
        return Integer.toBinaryString(mask);
    }
}
