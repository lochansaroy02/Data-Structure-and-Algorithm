package Arrays;

public class RotateFunction {

    public static void main(String[] args) {
            int [] arr = {4,3,2,6};
         int ans =  function(arr);
        System.out.println(ans);
    }


        public static int maxRotateFunction(int[] arr) {
            int n = arr.length;
            int sumOfElements = 0;
            int currentFunctionValue = 0;

            // Calculate the initial function F(0) and the sum of the elements.
            for (int i = 0; i < n; i++) {
                sumOfElements += arr[i];
                currentFunctionValue += i * arr[i];
            }

            // Initialize max with the first function value (F(0))
            int max = currentFunctionValue;

            // Calculate all subsequent function values using the relation
            for (int i = 1; i < n; i++) {
                currentFunctionValue += sumOfElements - n * arr[n - i];
                max = Math.max(max, currentFunctionValue);
            }

            return max;
        }


    public  static   int function(int [] arr){
            int max = Integer.MIN_VALUE;
            int count = 0;
            while(count < arr.length){
                int sum = getsum(arr);
                rotate(arr);
                max = Math.max(sum,max);
                count++;
            }
            return max;
    }

    public  static void rotate(int [ ] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];

        }
        arr[arr.length-1] = temp;

    }


    public  static  int getsum( int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (i*arr[i]);
        }
        return sum;
    }

}


