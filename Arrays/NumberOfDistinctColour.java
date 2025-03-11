package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class NumberOfDistinctColour {
    public static void main(String[] args) {
        int [][]queries = {{0,1}, {1,2},{2,2},{3,4}, {4,5}};
        int limit = 4;
        distinctColour(queries, limit);
    }

    public static  void distinctColour(int [][] queries , int limit ){
        int [] ans= new int[limit+1];
        HashSet<Integer> set = new HashSet<>();
        int [] result = new int[limit+2];
        int i = 0;
        for(int []  arr : queries){
            int index = arr[0];
            int colour = arr[1];

            ans[index] = colour;
            set.add(colour);
            result[i] = set.size();
            i++;

        }
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(result));
    }
}
