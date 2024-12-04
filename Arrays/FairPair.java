package Arrays;

public class FairPair {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        fairPair(arr);
    }
    public static  void fairPair(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%2==0){
                System.out.print(arr[j]);

                }else{
                    System.out.print(" ");
                }

            }

        }
    }
}
