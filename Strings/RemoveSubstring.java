package Strings;

import java.util.Stack;

public class RemoveSubstring {

    public static void main(String[] args) {
        System.out.println(minLengthUsingStack("ABFCACDB"));
    }


    public static  int minLengthUsingStack(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(ch=='B' && st.peek()=='A'){
                st.pop();
            }else if(ch=='D' && st.peek()=='C'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.size();

    }


    public static  int minLength(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 1;
        while(j< sb.length()){
            if(i< 0){
                i++;
                sb.setCharAt(i, sb.charAt(j));
            }else if((sb.charAt(i)== 'A' && sb.charAt(j)== 'B') || (sb.charAt(i)== 'C' && sb.charAt(j)== 'D') ){
                i--;
            }else{
                i++;
                sb.setCharAt(i, sb.charAt(j));
            }
            j++;

        }
        return i+1;
    }
}
