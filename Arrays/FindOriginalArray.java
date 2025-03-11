package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindOriginalArray {
    public static void main(String[] args) {

    }
    public  static  int [] original(int [] arr){
        int n = arr.length;
        if(n%2!=0){
            return  new int[0];
        }

        Arrays.sort(arr);


        HashMap<Integer, Integer> mp = new HashMap<>();
        // filling elements in the hashmap
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[n / 2];
        int index = 0;


        for (int num : arr) {
            if (mp.get(num) == 0) continue; // Skip if already used

            int twice = num * 2;

            // If there is no double of the current number in the map, return empty
            if (!mp.containsKey(twice) || mp.get(twice) == 0) {
                return new int[0];
            }

            ans[index++] = num;
            // Decrease frequency counts
            mp.put(num, mp.get(num) - 1);
            mp.put(twice, mp.get(twice) - 1);
        }
        return  ans;
    }
}
