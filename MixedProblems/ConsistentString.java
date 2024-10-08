package MixedProblems;

public class ConsistentString {
    public static void main(String[] args) {
            String allowed = "abc";
            String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(consistent(allowed,words));
    }

    public static  int consistent( String allowed, String[] words ){
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            mask |= (1<< ch-'a');
        }


        int count = 0;

        for(String st: words){
            boolean isAllChar = true;
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                if((mask>>(ch-'a')&1)==0){
                    isAllChar= false;
                    break;
                }
            }
            if(isAllChar){
                count++;
            }

        }
        return count;
    }
}
