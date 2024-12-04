package Arrays;

import java.util.Arrays;

public class MinimumSum {

    public static void main(String[] args) {
        int [] arr = {5, 3, 0, 7, 4};
        System.out.println(  minimumSum(arr));
    }
    //  my approach : the issue is that it not taking 0 as the input
    public static  void minSum( int [] arr){
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int num = 0;
        int num2 = 0;
        int digit = arr.length/2;
        while(j< arr.length ){
            num = num+ (arr[i]*(int)(Math.pow(10,digit-1 )));
            num2 = num2+ (arr[j]*(int)(Math.pow(10,digit-1 )));
            digit--;
            i= i+2;
            j= j+2;
        }
        System.out.println(num);
        System.out.println(num2);
    }

    // better approach
    public static String minimumSum(int [] arr){
        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1.append(arr[i]);
            } else {
                num2.append(arr[i]);
            }
        }

        int number1 = Integer.parseInt(num1.toString());
        int number2 = Integer.parseInt(num2.toString());
        return  String.valueOf(number1+ number2);
    }

}
