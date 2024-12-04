package HashMap;

import java.util.HashMap;

public class FancyString {
    public static void main(String[] args) {
                String st = "aaabaaaa";
                fancy(st);

    }
    public static  String fancy(String str ){
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0)).append(str.charAt(1));
        for (int i = 2; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(i-1)|| str.charAt(i)!= str.charAt(i-2)){
                ans.append(str.charAt(i));
            }


        }
         return ans.toString();

    }

}