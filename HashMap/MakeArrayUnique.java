package HashMap;

import java.util.HashMap;

public class MakeArrayUnique {

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3};
        makeArrayUnique(arr);
    }
    public  static  void makeArrayUnique(int [] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int j : arr) {
            if (mp.containsKey(j)) {
                mp.put(j, mp.get(j)+1);

            } else {
                mp.put(j, 1);
            }
        }
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());

    }
}
