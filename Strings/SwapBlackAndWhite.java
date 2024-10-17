package Strings;

public class SwapBlackAndWhite {
    public static void main(String[] args) {
        System.out.println(swap("110000011"));
    }
    public  static  int swap( String s ){
        int swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='1'){
                black++;

            } else if (ch=='0') {
                swap+=black;

            }
        }
        return swap;
    }
}
