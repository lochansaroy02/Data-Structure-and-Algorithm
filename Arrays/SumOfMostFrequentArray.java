package Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SumOfMostFrequentArray {
    public static void main(String[] args) {
        int [] arr= {1,2,2,1,1,3,3,4,4,4,4,4,2};
//        System.out.println(sum(arr));
        sum(arr);
//
    }

    public static  void sum(int [] arr){
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for(int element: arr){
            mp.put(element, mp.getOrDefault(element, 0)+1);
        }
        for (int element : mp.keySet()) {
            pq.add(element);
        }
        PriorityQueue<Integer> mostFrequent = new PriorityQueue<>();

        if (!pq.isEmpty()) {
            mostFrequent.add(pq.poll());
        }
        if (!pq.isEmpty()) {
            mostFrequent.add(pq.poll());
        }
        System.out.println(mp);
        System.out.println(pq);

    }
}
