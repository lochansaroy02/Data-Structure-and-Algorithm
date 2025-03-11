package BItwise;

public class PairXOR {
    public static void main(String[] args) {
        int [] arr1 = {2,1,3};
        int [] arr2 = {10, 2,5,0};
        System.out.println( pairXOR(arr1,arr2));
    }
    public  static  void pair( int [] arr1, int[] arr2){
        int xor  = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                xor^= (arr1[i]^arr2[j]);
            }
        }
        System.out.println(xor);
    }

    public static  int pairXOR( int [] arr1 , int [] arr2 ){
        int n = arr1.length;
        int m = arr2.length;
        int xor = 0;
        if(m%2!=0){
            for(int x : arr1){
                xor^=x;
            }
        }
        if(n%2!=0){
            for(int x: arr2){
                xor^=x;
            }
        }
        return xor;
    }
}
