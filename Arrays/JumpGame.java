package Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr = {3,3,1,0,4};
        System.out.println(jump(arr));
    }
    public static  boolean jump ( int [] arr){
        int n = arr.length;
        int i = 0;
        while(n>0){
            if(arr[i]==0){
                return false;
            }
            n = n-arr[i];
            i = i+arr[i];
        }
//        System.out.println(n);
        return true;
    }
}
