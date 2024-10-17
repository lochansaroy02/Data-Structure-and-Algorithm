package SlidingWindow;

public class Template {
    public static  void fixedSized( int [] arr, int k){
        int i = 0;
        int j = 0;
        int n = arr.length;
//         window size = j-i+1;
        while(j< n){
            //perform an operation
            if(j-i+1< k){
                j++;
            }
            else if( j-i+1==k){
                //store the possible ans
                //remove the i
            }
        }

    }
}
