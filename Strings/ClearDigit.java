package Strings;

public class ClearDigit {
    public static void main(String[] args) {
        System.out.println(clear("abc34d"));
    }
    public static  String clear( String s){
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            // how to check if char is digit or alphabet
            if(ch >= 'a' && ch <= 'z'){
                res.append(ch);
            }else{
                res.deleteCharAt(res.length()-1);
            }
        }
        return  res.toString();

    }
}
