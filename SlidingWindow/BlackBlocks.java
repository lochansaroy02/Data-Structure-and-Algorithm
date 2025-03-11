package SlidingWindow;

public class BlackBlocks {
    public static void main(String[] args) {
        System.out.println(blackBlocks("WBWBBBW", 2));
    }

    public static  int blackBlocks ( String st  , int k ){
        int n = st.length();
        int i = 0;
        int  j = 0;
        int w = 0;
        int ops = Integer.MAX_VALUE;

         while( j< n){
             if(st.charAt(j)== 'W'){
                w++;
             }

             if(j-i+1 == k){
                 ops = Math.min(w,ops);
                 if(st.charAt(i )== 'W'){
                     w--;


                 }
                 i++;
             }
             j++;
         }
         return ops;
    }
}
