package Arrays.Matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int [] ans = upward(mat);
        System.out.println(ans.toString());

    }

    public static  int []   upward( int [] [] mat){
        //i+j : for upward direction ↗️
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        int m = mat.length;
        int  n = mat[0].length;

        ArrayList<Integer> ans  = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mp.putIfAbsent(i+j,new ArrayList<>());
                mp.get(i+j).add(mat[i][j]);
            }
            System.out.println();
        }

        boolean flip = true;
        for(ArrayList<Integer> lst : mp.values()){
            if(flip){
                Collections.reverse(lst);
            }
            ans.addAll(lst);
            flip =!flip;
        }
        return  ans.stream().mapToInt(i->i).toArray();


    }
}
