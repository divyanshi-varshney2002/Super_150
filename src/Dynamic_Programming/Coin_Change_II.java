package Dynamic_Programming;

public class Coin_Change_II {
    public static void main(String[] args) {
        int coin[]={1,2,5};
        int amount =5;
        System.out.println(Coin_Change(coin,amount,0));
    }
    public static int Coin_Change(int coin[],int amount,int idx){
        if(amount==0) return 1;
        if (idx==coin.length) return 0;
        int inc=0,exc=0;
        if(coin[idx]<=amount)
            inc=Coin_Change(coin,amount-coin[idx],idx);
        exc=Coin_Change(coin,amount,idx+1);
        return inc+exc;
    }
}
