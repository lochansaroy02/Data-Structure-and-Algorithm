package BItwise;

public class MinimumFlipToMakeOR {
    public static void main(String[] args) {

    }
    public static  int minFlip ( int a, int b, int c){
        int flip = 0;
        if(((c&1)== 1)){
            if((a&1)== 0 && (b&1)==0){
                flip++;
            }
        }
        if((c&1)==0){
            if((a&1)== 1 && (b&1)==1){
                flip+=2;
            }
            if((a&1)== 1 ){
                flip++;
            } if((b&1)== 1 ){
                flip++;
            }
        }
        return flip;
    }
}
