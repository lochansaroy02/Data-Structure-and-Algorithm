package Arrays;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class DividePlayersIntoTeam {
    public static void main(String[] args) {
            int  [] arr = {3,4};
        System.out.println(dividePlayers(arr));


    }
    public static  long dividePlayer(int [] arr){
        Arrays.sort(arr);
       if(arr.length%2!=0){
           return -1;
       }
       int i = 0;
       int j = arr.length-1;
       int sum = arr[i]+arr[j];
       long chemistry = 1;
       while(i<j){
           int thisSum = arr[i] + arr[j];
            if(thisSum !=sum){
                return -1;
            }
            chemistry+= (long)(arr[i])*(long)(arr[j]);
            i++;
            j--;

       }
       return chemistry;

    }
    public static  long dividePlayers(int [] arr){
        int n = arr.length;
        int [] freq = new int[1001];
        int totalSum = 0;
        for(int s : arr){
            totalSum+=s;
            freq[s]++;
        }
        int teams = n/2;
        if(totalSum%teams!=0){
            return -1;
        }
        int targetSum = totalSum/teams;
        long chemistry= 0;
        for(int skill: arr){
            int remainSkill = targetSum-skill;
            if(freq[remainSkill]<=0){
                return -1;
            }
            chemistry+= (long) skill* (long)(remainSkill);
            freq[remainSkill]--;


        }
        return chemistry/2;

    }
}
