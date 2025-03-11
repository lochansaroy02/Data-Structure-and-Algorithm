package Heap;

import java.util.PriorityQueue;

public class MinOperation {
    public static void main(String[] args) {

    }

    public static  int minOperation( int [] arr, int k){
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int x : arr){
            pq.add((long)x);
        }

        int count = 0;
        while( !pq.isEmpty() && pq.peek() < k){
            long  x = pq.poll();
            long y = pq.poll();

            pq.add(x*2+ y);
            count++;


        }
        return count;
    }
}
