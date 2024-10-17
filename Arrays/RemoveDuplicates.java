package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr = {0,0,0,1,1,2,2,3,3};
        System.out.println(removeDuplicate2(arr));

    }
    public static  int removeDuplicate(int [] arr){
            if(arr.length== 0){
                return 0;
            }
            int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!= arr[j]){
                i++;
                arr[i] = arr[j];

            }
        }
        return i+1;
    }
    public static  int removeDuplicate2(int []arr){
        if(arr.length== 0){
            return 0;
        }

        int j = 1;
        int count = 1;
        for (int i= 1; i < arr.length; i++) {
            if(arr[i]== arr[i-1] ){
                count++;
            }else{
                count=1;
            }
            if(count <= 2){
                arr[j] = arr[i];
               j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return j;
    }

}
