package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,1,2};
    }


        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer>  set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }




}
