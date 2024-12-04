package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxBeauty {
    public static void main(String[] args) {

    }
    public static  int binarySearch(int [][] items, int queryPrice){
        int left = 0;
        int right = items.length-1;
        int maxBeauty = 0;

        while(left<= right){
            int mid = left+(right-left)/2;
            if(items[mid][0]> queryPrice){
                right = mid-1;
            }else{
                maxBeauty = Math.max(maxBeauty, items[mid][1]);
                left = mid+1;

            }
        }
        return maxBeauty;

    }
    public static  int [] maxBeauty( int [][] items, int []queries ){
        int n = items.length;
        int  m = queries.length;
        int [] result = new int[m];

//        Sort the array
        Arrays.sort(items, (a,b) -> Integer.compare(a[0], b[0]));
        int maxBeautySeen = items[0][1];
        for (int i = 0; i < n; i++) {
            maxBeautySeen= Math.max(maxBeautySeen, items[i][1]);
            items[i][1] = maxBeautySeen;
        }
        for (int i = 0; i <m ; i++) {
            int queryPrice = queries[i];
            result[i] = binarySearch(items , queryPrice);
        }
        return result;
    }
}
