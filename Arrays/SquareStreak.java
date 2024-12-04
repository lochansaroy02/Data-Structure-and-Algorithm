package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SquareStreak {
    public static void main(String[] args) {

    }
    // by using hashmap
    public static  int approach1( int [] arr){
        //sort the array
        int maxStreak = 0;
        Arrays.sort(arr);
        // in hashmap --
        HashMap<Integer , Integer> mp = new HashMap<>();

        // check if the number is square or not
        for (int num : arr) {
            int root = (int) (Math.sqrt(num));


            if (root * root == num && mp.containsKey(root))  { // && mp.get(root)
                // if yes - find the root of num and put in map with its count + root count
                mp.put(num, mp.get(root)+1);
            }else{
                //if not - put in map with count 1
                mp.put(num, 1);
            }

            maxStreak = Math.max(maxStreak, mp.get(num));
        }
        return maxStreak <2 ? -1: maxStreak;



    }
}
