package Arrays;

import java.util.HashMap;

public class BadPairs {
    public static void main(String[] args) {
        int [] arr = {4,1,3,3};
        System.out.println(badPairs(arr));
    }
    public static  int badPairs( int [] arr){
        int n = arr.length;
       int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]-i;
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(arr[0], 1);

        for (int j = 0; j < n; j++) {
            int count = mp.getOrDefault(arr[j], 0);
            int total = j;
            int badPairs = total-count;
            result += badPairs;
            mp.put(arr[j], count+1);


        }
        return result;



    }
}
