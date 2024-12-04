package Arrays.Matrix;

import java.util.Arrays;
import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {
//        int [] [] arr = {{3,4,5},{7,8,4},{2,9,6}};
        int [ ] arr = {2,4,5,2,2,3,5};
        checkArray(arr);

    }

    public static  void  sudoku(int [][] arr){

        // check every row
        for(int [] row : arr){

            checkArray(row);
            System.out.println(Arrays.toString(row));
        }


        // check every column
        //check every 3x3 box



    }
    public static void checkArray( int [] arr){
           HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        System.out.println(st);

    }
}
