package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DoubleExist {
    public static void main(String[] args) {
        int [] arr= {3,1,7,11};
        System.out.println(isDoubleExist2(arr));
    }

    public static  boolean isDoubleExist(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]!= arr[j] && arr[i] == 2 * arr[j] && 0<=i && j< arr.length){
                    return  true;
                }
            }
        }
        return false;
    }

    public static  boolean isDoubleExist2(int [] arr){
        Set<Integer> seen = new HashSet<>();
        for(int num : arr){
            if(seen.contains(2* num) || ( num%2 ==0 && seen.contains(num/2))){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
