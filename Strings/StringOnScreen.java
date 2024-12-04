package Strings;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

public class StringOnScreen {
    public static void main(String[] args) {

        stringSequence("abc");

    }

    public static List<String> stringSequence(String target){
        List<String> result = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <target.length() ; i++) {
            char ch = target.charAt(i);
            ans.append('a');
            result.add(ans.toString());
            while(ans.charAt(i)!= target.charAt(i)){
                ans.setCharAt(i,(char)(ans.charAt(i)+1));
                result.add(ans.toString());
            }

        }
        return result;
    }
    public static  char key2(char ch, char targetChar){

        while( ch< targetChar){
            ch = (char) (ch +1);
            System.out.println(ch);
        }

        return  ch;
    }
}
