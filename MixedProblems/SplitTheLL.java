package MixedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SplitTheLL {
    public static void main(String[] args) {
        int [] parts= part(2,3 );
        System.out.println(Arrays.toString(parts));
    }

    public static int [] part(int size, int k) {
        int[] arr;
        int part = 0;
        int remain = 0;
        if (size < k) {
            arr = new int[size];
            part = 1;
            remain = k - size;
            arr[0] = part;

        }
        if (size % k == 0) {
            arr = new int[1];
            part = size / k;
            arr[0] = part;
        }
          else{
              arr = new int[k];
            int res = size / k;
            int rem = size % k;
            Arrays.fill(arr, res);
            for (int i = 0; i < rem; i++) {
                arr[i] = arr[i] + 1;
            }

        }
        return arr;
        }



    }


