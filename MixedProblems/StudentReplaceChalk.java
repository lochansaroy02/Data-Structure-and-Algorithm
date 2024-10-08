package MixedProblems;

public class StudentReplaceChalk {
    public static void main(String[] args) {
        int [] arr = {3,4,1,2};
        int k = 25;
     int ans =  replaceChalk(arr,k);
        System.out.println(ans);
    }

    public static  int replaceChalk(int [] arr, int k){
            int  i = 0;
            int count = 0;
            int n = arr.length;
            while( k > 0){
                k = k-arr[i];
                 i = (i+1)%n;
                 count++;
            }
        return i;

    }

}
