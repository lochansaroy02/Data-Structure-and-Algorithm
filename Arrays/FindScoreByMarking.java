package Arrays;

import java.util.Arrays;

public class FindScoreByMarking {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,3,4,4};
        System.out.println(findScore(arr));
    }
    public  static  int getMinIndex( int [] arr){
        int index = 0;
        int min =  Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static  int findScore(int [] arr ){
      int score = 0;
      boolean [] marked = new boolean[arr.length];
      Arrays.fill(marked, false);


      int [][] pairs = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            pairs[i][0]= arr[i];
            pairs[i][1] = i;
        }

        // How to sort on the basis of element

        Arrays.sort(pairs, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });


        for (int[] pair : pairs) {

            int element = pair[0];
            int index = pair[1];


            if (!marked[index]) {
                score += element;
                marked[index] = true;
                if (index - 1 >= 0) {
                    marked[index - 1] = true;
                }
                if (index + 1 < arr.length) {
                    marked[index + 1] = true;
                }
            }
        }


      return score;

    }
}
