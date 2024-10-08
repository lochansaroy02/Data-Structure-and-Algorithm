package MixedProblems;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day2 {
    public static void main(String[] args) {
        int [][] arr = {{5, 2, 3}, {3, 2, 7},{5,5,7}};
        System.out.println(absSum(arr));
    }

    public static  int stringScore(String s ){

        ArrayList <Integer> list = new ArrayList<>();
        int sum = 0;
            for (int i = 0; i < list.size()-1; i++) {

                        sum = sum+(Math.abs(s.charAt(i)-s.charAt(i+1)));

        }
        return sum;
    }

    //Find unique element

    public static  int uniqueElement(int [] arr){

        int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                sum = sum^arr[i];
        }



        return sum;

    }

    //absolute differance of Diogonals
    public static  int absSum(int [][] arr){

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum = sum+arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum2 = sum2+arr[i][j];
                }
            }
        }
        return Math.abs(sum-sum2);
    }




}

