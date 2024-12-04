package Arrays;

import java.util.Collections;
import java.util.TreeSet;
import java.util.PriorityQueue;

public class SecondLargestElement {
    public static void main(String[] args) {
            int [] arr = {10,5,10};
        System.out.println(secondLargestElement(arr));

    }
    public static  int secondLargestElement(int [] arr){
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(2);
        // Use a TreeSet to store unique elements in descending order
        TreeSet<Integer> minHeap = new TreeSet<>(Collections.reverseOrder());
        /*
        Here are the steps to find the max unique element
        - add all the element in the treeSet
        - traverse through the unique element

        * */
        int size = 2;
        // heap size will be size kth size ( 2)
        for(int el: arr){
            minHeap.add(el);
        }
        int count = 0;
        for(int num : minHeap){
            count++;
            if(count== 2){
                return num;
            }
        }
        return -1;

    }
}
