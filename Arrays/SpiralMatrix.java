package Arrays;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
       spiralMatrix3(2);

    }


    //print the elements of 2D array in spiral form

    public static  ArrayList<Integer> spiralMatrix1( int [][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;
        int dir = 0;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(arr[top][i]);
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(arr[i][right]);
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[down][i]);
                }
                down--;
            }
            if (dir == 4) {
                for (int i = down; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
            dir++;

        }
        return list;

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
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    ans[i][right] = arr[index];
                    index++;
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    ans[down][i] = arr[index];
                    index++;
                }
                down--;
            }
            if (dir == 4) {
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

    public static  void spiralMatrix3( int n) {
        int [][] ans = new int[n][n];
        int top = 0;
        int down = n- 1;
        int left = 0;
        int right = n - 1;
        int dir = 0;
        int index = 1;
        while (index <= n*n) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    ans[top][i] = index;
                    index++;
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    ans[i][right] = index;
                    index++;
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    ans[down][i] = index;
                    index++;
                }
                down--;
            }
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    ans[i][left] = index;
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

    // print the array in spiral 2d Array

}

