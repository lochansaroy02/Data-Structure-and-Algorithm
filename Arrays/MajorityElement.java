package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,1,2};

        System.out.println(majorityElement2(arr));

    }

    public static  int majorityElement1(int [] arr){
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(count==0){
                candidate = arr[i];
                count= 1;
            } else if (candidate== arr[i]) {
                count++;
            }else{
                count--;
            }

        }
        return candidate;


    }
    public static List<Integer> majorityElement2(int [] arr){
      int n = arr.length;

      int maj1= arr[0];
      int count1 = 1;

      int maj2 = arr[0];
      int count2 = 1;

        for (int i = 1; i < n ; i++) {
            int curr = arr[i];
            if(curr == maj1){
                count1++;
            } else if (curr == maj2) {
                count2++;
            } else if (count1==0) {
                maj1 =curr;
                count1=1;
            } else if (count2 == 0) {
                maj2 = curr;
                count2= 1;
            }else{
                count1--;
                count2--;
            }

        }

       List<Integer> ans = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;

        for(int num : arr){
            if(num== maj1){
                freq1++;
            } else if (num== maj2) {
                freq2++;
            }
        }

        if(freq1> Math.floor((double) (n/3))){
            ans.add(maj1);
        }else if(freq1> Math.floor((double) (n/3))){
            ans.add(maj2);
        }
        return  ans;
    }
}
