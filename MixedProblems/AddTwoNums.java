package MixedProblems;

public class AddTwoNums {
    public static void main(String[] args) {
            int [] arr = {1,2,3,3,2,4,5,6};
        System.out.println(addNum( arr));
    }

    public static  double addNum(int [] arr1){
        int m = arr1.length;
//        int n = arr2.length;
        double num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            num1 = num1 + (arr1[i] * (Math.pow(10, m-1)));
            m--;
        }


        return num1;

    }
}
