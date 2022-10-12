package Recursion;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coin={2,3,5,7};
        int amount=10;
        PrintAnswer(coin,amount,"");
    }
    public static void PrintAnswer(int coin[],int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i]){
                PrintAnswer(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
}
