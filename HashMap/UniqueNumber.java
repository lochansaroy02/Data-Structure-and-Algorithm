package HashMap;

import java.util.HashMap;

public class UniqueNumber {
    public static void main(String[] args) {
            int [] arr = {2, 3, 1, 6, 3, 6, 2};
            uniqueNumber( arr);
    }
    public  static  void uniqueNumber( int [] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int j : arr) {
            if (mp.containsKey(j)) {
                mp.put(j, mp.get(j) + 1);
            } else {
                mp.put(j, 1);
            }
        }
        System.out.println(mp.keySet());
        System.out.println(mp.values());

    }
}
