package Arrays;

import java.util.ArrayList;

public class Triangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        int[][] elements = {
                {-1},{2,3},{1,-1,-3}
        };

        for (int[] elementArray : elements) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int element : elementArray) {
                inner.add(element);
            }
            outer.add(inner);
        }

        System.out.println(triangle(outer));


    }
    public static  int  triangle(ArrayList<ArrayList<Integer>> outer){
        int sum  = 0;
        for (ArrayList<Integer> list : outer) {
            int min = findMin(list);
            System.out.println(min);
            sum += min;

        }
        return sum;
    }

    public static  int findMin ( ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            min = Math.min(min, integer);
        }
        return min;
    }
}
