package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
            SinglyLL list = new SinglyLL();
//            list.insertFirst(1);
            list.insertFirst(1000);
            list.twinSum();
            list.display();

    }



    public static void splitArray ( int [] arr, int k){
        int [] parts = part(arr.length, k);
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            int index=0;
            for (int i = 0; i < parts.length; i++) {
                int count= 0;
                ArrayList<Integer> list = new ArrayList<>();
                int part = parts[i];
                while(count < part){
                    list.add(arr[index]);
                    count++;

                }
                index = part;
                ans.add(list);

        }
        System.out.println(ans);
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

    public static  void spiralMatrix2( int [] arr, int row, int col) {
        int [][] ans = new int[row][col];
        int top = 0;
        int down = row- 1;
        int left = 0;
        int right = col - 1;
        int dir = 0;
        int index = 0;

        while (index < arr.length) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    ans[top][i] = arr[index];
                    index++;
                }
                top++;
            }else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    ans[i][right] = arr[index];
                    index++;
                }
                right--;
            }else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    ans[down][i] = arr[index];
                    index++;
                }
                down--;
            }else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    ans[i][left] = arr[index];
                    index++;
                }
                left++;
            }
            dir = (dir + 1) % 4;


        }
        display(ans);

    }


    public static  void display ( int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }




}
