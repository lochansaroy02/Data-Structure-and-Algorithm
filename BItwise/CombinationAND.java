package BItwise;

public class CombinationAND {
    public static void main(String[] args) {
            int [] arr= {1,4,5,9,8,7,2};
        System.out.println(combinationAND(arr));
    }
    public static  int combinationAND( int [] arr){

        // number of bits required to represent a number in binary
        // take log of the number, take floor and add 1 to it
        // bits = floor(log(n))+1;



        int ans = 0;
        for (int bitPos = 0; bitPos < 32; bitPos++) {
        int count = 0;
            for(int num: arr){
                if((num &(1<<bitPos))!=0){
                    count++;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
