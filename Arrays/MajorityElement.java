package Arrays;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public static  int majorityElement1(int [] arr){
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(count==0){
                candidate = arr[i];

            }
            if(candidate!= arr[i]){
                count--;

            }

        }
        return candidate;


    }
}
