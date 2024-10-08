package Strings;

public class GCD {
    public static void main(String[] args) {
//        System.out.println( GDCofString("ABABAB", "ABAB"));
        System.out.println( gcdOfLength(12,16));
        gcd("ABABABAB", "ABAB");

    }
    public static  String GDCofString( String s1, String s2){
       StringBuilder ans = new StringBuilder();
       int i = 0;
       int j = 0;
       boolean flag = true;
       while(j<s2.length() && flag ){
           if(s1.charAt(i)==s2.charAt(j)){
               ans.append(s1.charAt(i));
               i++;
               j++;
           }

           else{
               flag = false;
               i++;
           }
          
       }
       return ans.toString();
    }

    public static  void gcd( String s1, String s2){
           int length = gcdOfLength(s1.length(), s2.length());
        System.out.println(length);

    }

    private static int gcdOfLength(int a, int b) {
        if(b==0){
            return  a;
        }
        return gcdOfLength(b, a%b);
    }

}
