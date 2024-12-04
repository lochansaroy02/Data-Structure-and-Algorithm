package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParsingBoolean {
    public static void main(String[] args) {
        System.out.println(parseBoolean("&(|(f))"));
    }

    public static  char solve ( char op, List<Character> list){
        if (op=='!'){
            return list.getFirst() =='t'? 'f':'t';
        }
        if (op == '&')
            return list.stream().anyMatch(ch -> ch == 'f') ? 'f' : 't';

        if (op == '|')
            return list.stream().anyMatch(ch -> ch == 't') ? 't' : 'f';

        return 't';
    }
    public  static  boolean parseBoolean(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch==','){
                continue;
            }
            if(ch==')'){
                List<Character> list = new ArrayList<>();
                while (st.peek()!='('){
                    list.add(st.pop());
                }

                st.pop();
                char op = st.pop();
                st.push(solve(op, list));
            }else{
                st.push(ch);
            }
        }

        return st.peek()=='t';
    }
}
