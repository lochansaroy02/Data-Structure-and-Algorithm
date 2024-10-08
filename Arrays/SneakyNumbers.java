package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SneakyNumbers {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
         solution(arr);
    }

    public static  void solution(int [] arr){
        ArrayList<Integer >list = new ArrayList<>();

        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && (arr[i]^arr[j])==0 && !list.contains(arr[j]) ){
                  list.add(arr[j]);

                }
            }
        }
        int [] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
