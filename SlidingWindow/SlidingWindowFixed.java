package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowFixed {
    public static void main(String[] args) {
            int [] arr = {12,-1,-7,8,-15,30,16,28};
            int n = arr.length;
        System.out.println( negativeNumber(arr, n,3));

    }

    //max sum sub array of  size k
    public static  int maxSumSubarray(int [] nums,  int k){
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int max = 0;
        while(j < n ){
            sum += nums[j]; 
            if(j-i+1 <k ){
                j++;
            } else if (j-i+1==k) {
                max = Math.max(max,sum);
                sum -= nums[i];
                i++;
                j++;
            }

        }
        return max;
    }


    // max sum in all subarray of size k

    public static ArrayList<Integer> negativeNumber(int [] arr, int n , int k){

        ArrayList<Integer > list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i= 0;
        int j= 0;

        while (j< n ){
                if(arr[j]<0){
                    queue.add(arr[j]);
                }
                if(j-i+1 < k){
                    j++;

                }
                if(j-i+1 ==k){
                    if(queue.isEmpty()){
                        list.add(0);
                    }
                    else{
                       list.add(queue.peek());
                       if(arr[i]==queue.peek()){
                           queue.remove();


                       }

                    }
                    i++;
                    j++;
                }




        }
        return list;


    }
    public static  int maxInSubarray(int[] arr, int k, int threshold) {
        ArrayList<Integer > list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
            int i = 0;
            int j = 0;
            int max = 0;
            int n = arr.length;

            while  (j<n){

                while(!queue.isEmpty() && queue.peek() <arr[j]){
                    queue.remove();
                }
                queue.add(arr[j]);
                //calculation
                if(j-i+1<n){
                    j++;
                }

                if(j-i+1==k){
                    //get the answer from calculation
                    list.add(queue.peek());

                }

            }

          return -1;
    }


}
