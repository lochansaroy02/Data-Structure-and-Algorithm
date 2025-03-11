package SlidingWindow;

public class AlternatingColour2 {
    public static void main(String[] args) {

    }

    public static  int alternatingColor(int [] color, int k){
        int N = color.length+ (k-1);
        int [] arr = new int[N];
        // append the elements in the array
        System.arraycopy(color, 0, arr, 0, color.length);
        if (k - 1 >= 0) System.arraycopy(color, 0, arr, color.length + 0, k - 1);


        int result = 0;
        int i = 0 , j=1;
        while( j< N){
            if(arr[j]== arr[j-1]){
                i = j;
                j++;
                continue;
            }

            if( j-i+1 == k){
                result++;
                i++;
            }
            j++;
        }
        return result;
    }
}
