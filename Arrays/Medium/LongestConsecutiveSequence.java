package Arrays.Medium;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr = {1,2,101, 3,4,102, 5};
        System.out.println(optimal(arr));
    }

    // brute force
    public static  int bruteForce( int [] arr){
        if(arr.length== 0 ){
            return 0;
        }
        Arrays.sort(arr);
        int result = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]+1== arr[i+1]){
                result++;
            }
        }
        return result+1;
    }

    public static int  slidingWindow( int [] arr ){
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        int i , j=0;
        int result = 0;

        while(j<n-1){
            if(arr[j]+1 == arr[j+1]){
                result++;
            }else{
                ans = Math.max(result, ans);
                result=0;
                i = j;
            }
            j++;
        }
        return ans;
    }


    public  static int optimal(int [] arr){
        int n = arr.length;
        if( n== 0) return 0;
        int longest = 1;

        Set<Integer> st = new HashSet<>();

        // put  all the elements in the set
        for(int el : arr){
            st.add(el);
        }

        for(int it : st){
            if(!st.contains(it-1)){
                int cnt = 1;
                int x = it;
                while( st.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest= Math.max(longest,cnt);

            }
        }
        return longest;
    }
}
