package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NearlySortedByK {
    public static void main(String[] args) {
            int [] arr = {6, 5, 3, 2, 8, 10, 9};
            int k = 3;
            nearlySorted(arr,k);
    }
    public static  void nearlySorted(int [] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int id = 0;

        while (i<arr.length &&  i <=k){
            pq.add(arr[i]);
            i++;
        }
        for (int j = k+1; j <arr.length ; j++) {
                pq.poll();
                pq.add(arr[i]);

        }
        while(!pq.isEmpty()){
            arr[id++]= pq.poll();
        }

        System.out.println(Arrays.toString(arr));

    }
}
