package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElement {
    public static void main(String[] args) {
            int [] arr = {3,2,1,5,6,4};
          int ans =    kthLargestElement(arr,2);
        System.out.println(ans);
    }
    public  static  int  kthLargestElement(int [] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
        for (int j : arr) {
            pq.add(j);
            while (pq.size() > k) {
                pq.poll();
            }

        }
       return  pq.peek();

    }
}
