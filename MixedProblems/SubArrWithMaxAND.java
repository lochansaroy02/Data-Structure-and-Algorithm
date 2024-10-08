package MixedProblems;

public class SubArrWithMaxAND {
    public static void main(String[] args) {
        int [] arr = {1,3,5,5,5,4,5,5,5,5,2,2,2,2,2};
        System.out.println(solution(arr));
    }
    public static  int solution( int []arr){
        int maxValue = 0;
        int streak  = 0;
        int result = 0;
        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
                result=0;
                streak=0;
            }
            if(maxValue==num){
                streak++;
            }else{
                streak=0;
            }
            result = Math.max(result,streak);
        }
        return result;

    }
}
