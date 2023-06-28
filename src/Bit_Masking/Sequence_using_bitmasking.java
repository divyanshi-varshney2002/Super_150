package Bit_Masking;

public class Sequence_using_bitmasking {
    public static void subsequence(String str){
        int n=str.length();
        for (int i = 0; i < (1<<n); i++) {
//            System.out.println(i); 0 - 2^n
            pattern(i,str);
        }
    }
    public static void pattern(int i,String str){
        int pos=0;
        while(i>0){
            if((i&1)!=0){
                System.out.print(str.charAt(pos));
            }
            i=i>>1;
            pos++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        subsequence("abc");
    }
}
