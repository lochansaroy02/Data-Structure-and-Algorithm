package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Ramp {
    public static void main(String[] args) {
        int [] arr = {6,0,8,2,1,5};
        nearestGreaterToRight(arr);
    }
    public  static  int maxRamp( int [] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<=arr[j]){
                    ans = Math.max(ans, j-1);
                }
            }
        }
        return ans;
    }

    public static void nearestGreaterToRight(int[] arr) {
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


        System.out.println(list);
    }
}
