package MixedProblems;

public class Day4 {
    public static void main(String[] args) {
        System.out.println(findCompliment(5));
    }
    public static  int findCompliment(int num){
        int num_bit = (int)(Math.log(num)/Math.log(2))+1;
        long mask = ((long)(1)<<num_bit)-1;
                return  (int)(mask^num);

    }


}
