package Arrays;

public class SortedOrNot {
    public static void main(String[] args) {

    }
    public static  boolean isSorted(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<= arr[j+1]){
                    continue;
                }else {
                    if (Integer.bitCount(arr[j]) == Integer.bitCount(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }else{
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
