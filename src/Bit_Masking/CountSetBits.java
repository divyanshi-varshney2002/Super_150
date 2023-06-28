package Bit_Masking;

public class CountSetBits {
    public static int countsetbit(int n) {
        int c=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
