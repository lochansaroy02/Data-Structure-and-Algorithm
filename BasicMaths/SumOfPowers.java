package BasicMaths;

public class SumOfPowers {
    public static void main(String[] args) {
        System.out.println(schoolApproach(16));
    }

    public static boolean  schoolApproach(int n){

        double p =  0;
        double num = (double)(n);
        while(Math.pow(num, p)<=num){
            p++;
        }

        while( num > 0){
            if(num >= Math.pow(3,p)){
                num = num - Math.pow(3,p);
            }

            if(n >= Math.pow(3,p)){
                return false;
            }
            p--;

        }

        return true;
    }
}
