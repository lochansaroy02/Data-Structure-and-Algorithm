package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
            int [] arr = {1,2,3,1};
        System.out.println(duplicate(arr, 3));
    }

    public static  boolean duplicate( int [] arr, int k){
        HashMap<Integer, Integer>mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i]) && Math.abs(mp.get(arr[i]) - i)<= k){
                return true;
            }else{
                mp.put(arr[i], i);
            }
        }
        return false;
    }
}
