package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TakePiles {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1};
        int k = 4;
        System.out.println(pickGifts(arr, k));
    }

    // Better approach
    public static  long pickGifts( int [] arr, int k){
        long sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        List<Integer> giftsList = new ArrayList<>();
        for (int gift : arr) {
            giftsList.add(-gift);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(giftsList);
        while( k--> 0){
            int maxElement = -pq.poll();
            pq.offer(-(int)Math.sqrt(maxElement));

        }
        long numberOfRemainingGifts = 0;
        while(!pq.isEmpty()){
            numberOfRemainingGifts -= pq.poll();
        }
        return numberOfRemainingGifts;
    }
    public static  long pickGift( int [] arr , int k){
            int i = 0;
            while(i< k){
                int  maxIndex = getMax(arr);
                double thisElement = arr[maxIndex];
                double maxElement = ( arr[maxIndex]);
                double minus = thisElement -  Math.floor(Math.sqrt(maxElement));
                maxElement = thisElement - minus;
                arr[maxIndex] = (int)(maxElement);
                i++;

            }
            return sum(arr);
    }
    public static  int sum(int [] arr){
        int sum =0;
        for(int j : arr){
            sum+=j;
        }
        return sum;
    }
    public  static int   getMax(int [] arr ){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                    index = i;
                }
        }
        return index;
    }
}
