package BItwise;

public class Basics {
    public static void main(String[] args) {
    }
    // to check bit set or not
    public static boolean isSet( int num, int pos){
        return (num & ( 1<<pos)) !=0;
    }

    public  static  int setBit(int num , int bit){
       return num |= ( 1<<bit);

    }

    public  static  int unSetBit(int num , int bit){
       return num &= ~(1<<bit);
    }


    public static  int minimizeXOR(int num1, int num2){
        int x = num1;
        //calculate setbits
        int reqBits = Integer.bitCount(num2);
        int currBits = Integer.bitCount(x);

        int bit = 0;

        if(currBits< reqBits){
            while(currBits< reqBits){
                if(!isSet(x, bit)){
                    setBit( x, bit);
                    currBits++;
                }
                bit++;
            }

        }else if( currBits> reqBits){
            while(currBits> reqBits){
                if(isSet(x, bit)){
                    unSetBit(x, bit);
                    currBits--;
                }

            bit++;
            }
        }
        return x;

    }
}
