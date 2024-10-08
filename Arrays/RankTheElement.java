package Arrays;

import java.util.Arrays;

public class RankTheElement {
    public static void main(String[] args) {
        int [] arr = {2,3,3,5,6,7,2,4,56,7,4,5};
        rank(arr);
    }

    public static  void rank(int [] arr){
        int [] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
//        System.out.println(Arrays.toString(copy));
        int [] ans  = new int[copy.length];
            int i = 0;
            while (i < ans.length-1){
                if(copy[i]!=copy[i+1]  ){
                    ans[i] = i+1;
                    i++;
                }else{
                    ans[i] = 0;
                }
            }
        System.out.println(Arrays.toString(ans));
    }

}
