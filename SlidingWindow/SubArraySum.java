package SlidingWindow;

public class SubArraySum {
    public static void main(String[] args) {
            int[] arr = {1,2,3};
            int k = 3;
        System.out.println(subArraySum(arr, k));
    }

    public static  int subArraySum( int [] arr, int k){
        int n = arr.length;
        int sum = 0;
        int count = 0;
        int i= 0, j=0;
        while (j< n){
            if(sum < k){
                sum+= arr[j];
            } else if (sum== k) {
                count++;
                i = j;
                sum= 0;
            }else{
                sum -= arr[i];
                i++;
            }

            j++;
        }
        return count;
    }
}
