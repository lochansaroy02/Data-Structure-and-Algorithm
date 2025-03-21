package Stack;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(minAddToValid("((()(("));

    }
    public static  boolean isValid(String s ){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='{'|| ch=='['|| ch=='('){
                st.add(ch);
            }else{
                if(st.isEmpty()){
                    return  false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
      return  st.isEmpty();


    }

    public static int minAddToValid(String s){
        int ans = 0;
       int open = 0;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='('){
                ans++;

            }else if(ch==')'){
                if(ans==0){
                   open++;
                }else{
                    ans--;
                }

            }
        }
        return ans+open;
    }

    public static int  LongestValidParentheses(String s ){
          return 1;
    }
}
