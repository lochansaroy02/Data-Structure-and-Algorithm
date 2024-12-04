package Strings;

public class BeautifulString {
    public static void main(String[] args) {
        System.out.println(beautifulString2("1001"));
    }
    public static  int beautifulString( String s){
        char ch = s.charAt(0);
        int count = 0;
        int changes = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== ch){
                count++;
                continue;

            }
            if(count%2==0){
                count=1;

            }else{
                changes+=1;
                count=0;

            }
            ch = s.charAt(i);
        }
        return changes;
    }

    //Approach 2
    public static  int beautifulString2(String s){
        int ans =0;
        for (int i = 0; i < s.length(); i+=2) { //checking two character at a time
            if(s.charAt(i)!=s.charAt(i+1)){
                ans++;
            }
        }
        return ans;

    }
}
