package Strings;

public class WordInSentence {
    public static void main(String[] args) {
     wordInSentence("This is the easy problem", "ea");
    }
    public static  String wordInSentence(String s, String word){
        String [] arr = s.split(" ");
        for (String string : arr) {
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i)== word.charAt(i)){
                    return string;
                }
            }
        }
        return "";
    }
}
