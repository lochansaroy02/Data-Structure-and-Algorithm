package Arrays;

import java.util.HashSet;

public class MaxNumberChooseFromRange {

    //Approach 1 : TC - o(n) and Sc- O(m)
    //Approach 2 : Tc - O(n*m)
    //Approach 3 : Tc - O( n * logM)  using binary search
    public static void main(String[] args) {
        int [] banned = {11};
        int n= 7;
        int maxSum = 50;
        System.out.println(chooseRange(banned, n , maxSum));


    }

    public static  int chooseRange( int [] banned , int n , int maxSum){
        HashSet<Integer> set = new HashSet<>();
        for (int j : banned) {
            set.add(j);
        }
        int count  = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(set.contains(i)){
                continue;
            }
            if(sum+ i <= maxSum){
                sum += i;
            }else{
                break;
            }
            count++;
        }

        return  count;
    }
}
