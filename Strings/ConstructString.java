package Strings;

public class ConstructString {
    public static void main(String[] args) {

    }
    public static  String construct( String s , int limit){
       int [] count = new int[26];
       for(char ch : s.toCharArray()){
           count[ch- 'a']++;
       }
       StringBuilder ans =  new StringBuilder();
       int i = 25;
       while( i>= 0){
           if(count[i]== 0 ){
               i--;
               continue;
           }

           char ch = (char)('a'+i);
           int freq = Math.min(count[i], limit);
           for (int j = 0; j < freq; j++) {
               ans.append(ch);

           }

           count[i] -= freq;


           if( count[i]>0){
               int j = i-1;
               while( j >=0 && count[j]== 0){
                        j--;

               }
               if(j> 0 ){
                   break;
               }

               ans.append((char)('a'+j));
               count[j]--;
           }
       }

        return ans.toString();
    }
}
