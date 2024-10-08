package MixedProblems;

public class Bank {

    public static void main(String[] args) {
        System.out.println(bank(9));
    }

    public static  int bank(int n){
        int mondayMoney = 1;
        int money = 0;
        for (int i = mondayMoney; i < n; i++) {
            money= money+i;
            if(i%7==0){
                money++;
            }
        }
        return money;
    }
}
