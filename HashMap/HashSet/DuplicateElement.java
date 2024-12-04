package HashMap.HashSet;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
                int [] arr = {1,2,3,3,2,1,2,3,3,4};
                duplicate(arr);
    }

    public static  void duplicate( int [] arr){
        HashSet<Integer> mp = new HashSet<>();
        for (int j : arr) {
            mp.add(j);
        }
        System.out.println(mp);
    }
}
