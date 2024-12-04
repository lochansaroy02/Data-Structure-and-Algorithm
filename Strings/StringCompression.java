package Strings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compression("aaaaaaaaaaaaaaabb"));
    }
    public static  String compression(String s){
        StringBuilder ans = new StringBuilder();
        int i =0;
        while( i< s.length()){
            int count = 0;
            char ch = s.charAt(i);
            while(i< s.length() && ch == s.charAt(i) && count < 9){ // order of boolean expression matters

                count++;
                i++;
            }
            ans.append(Integer.toString(count)).append(ch);
        }

        return ans.toString();
    }
}
