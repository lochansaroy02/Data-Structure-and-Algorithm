package Stack;

import java.util.Stack;

public class NumberOfSwapsToBalance {
    public static void main(String[] args) {
        System.out.println(minSwap("]]][[["));
    }

    public static  int balance( String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch== '['){
                st.push(ch);
            }else if( !st.isEmpty()){
                st.pop();
            }
        }
        int ans = st.size();
        return (ans+1)/2;
    }

    public static  int minSwap( String s){
       int temp = 0;
       int ans = 0;
       for( char ch : s.toCharArray()){
           if(ch==']'){
               temp++;
           }else{
               temp--;
           }
           ans = Math.max(temp, ans);
       }
       return (ans+1)/2;

    }


}
