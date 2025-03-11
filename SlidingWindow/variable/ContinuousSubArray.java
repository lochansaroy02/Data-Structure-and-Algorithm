package SlidingWindow.variable;

import java.util.TreeMap;

public class ContinuousSubArray {
    public static void main(String[] args) {

    }

    public static  int continuousSubArray (int [] arr){
        int i = 0;
        int j = 0;
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        int count = 0;

        while(j < arr.length){
                mp.put(arr[i], mp.getOrDefault(arr[j],0)+1);
                // this will handle the condition
                while (Math.abs(mp.lastKey() - mp.firstKey()) > 2){

                    mp.put(arr[i], mp.get(arr[i])-1);

                    if(mp.get(arr[i])==0){
                        mp.remove(arr[i]);
                    }

                    i++;
                }

                count += j-i+1;
                j++;
        }
        return count;
    }

}
