package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class FoundationProb {
    // NGL, NGR, NSL , NSR

    public static void main(String[] args) {

        int [] arr = {1,3,2,4};
        int n = arr.length;
        System.out.println(nearestSmallerToRight(arr));

    }
// Nearest Greater to Left
         public static ArrayList<Integer> nearestGreaterToLeft(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int j : arr) {
            while (!st.isEmpty() && j >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push(j);
        }

        return list;
    }
    //Nearest Greater to right
    public static ArrayList<Integer> nearestGreaterToRight(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1 ; i>= 0 ; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push(arr[i]);
        }


        return list;
    }


    public static ArrayList<Integer> nearestSmallerToRight(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1 ; i>= 0 ; i--) {
            while (!st.isEmpty() && arr[i] <= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push(arr[i]);
        }

        //answer is reverse of the list
        Collections.reverse(list);
        return list;
    }

    public static ArrayList<Integer> nearestSmallerToLeft(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int j : arr) {
            while (!st.isEmpty() && j <= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }
            st.push(j);
        }
        Collections.reverse(list);
        return list;
    }
}
