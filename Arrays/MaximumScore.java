package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumScore {
    public static void main(String[] args) {
            int [] arr = {10,10,10,10,10};
             System.out.println(maxKElement(arr,5));
    }

    public static  long maxKElement( int [] arr, int k){
       long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Java DOESN't provide heapify in O(n)
        for (int num : arr) {
            pq.add(num);
        }
        while(k-->0){
            int max = pq.poll();
            sum+=max;
            max = (int)(Math.ceil(max/3.0));
            pq.add(max);
        }
        return sum;

    }

    public static  int maxScore( int [] arr, int k){

        int score= 0;
        int i = 0;
         while(i< k){
               int [] ansList = getMax(arr);
               int index = ansList[1];
               int max = ansList[0];
               score+=max;
               double element = (double)(arr[index]);
               arr[index] =(int) (Math.ceil(element/3));
               i++;
         }
        return score;
    }
    public static  int [] getMax(int [] arr){
        int [] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max <arr[i]){
                max = arr[i];

                index = i;
            }
        }
        ans[0] = max;
        ans[1] = index;
        return ans ;
    }
}
