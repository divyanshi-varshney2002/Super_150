package Bit_Masking;

import java.util.Scanner;

public class NHAY_SPOJ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n= sc.nextInt();
            String pat=sc.next();
            String text=sc.next();
            lps(text,pat);
        }
    }
    public static void lps(String text,String pat){
        String s=pat+"#"+text;
        int dp[]=new int[s.length()];
        int len=0;
        for (int i = 1; i <dp.length ; ) {
            if(s.charAt(len)==s.charAt(i)){
                len++;
                dp[i]=len;
                i++;
            }else {
                if(len>0)len=dp[len-1];
                else{
                    dp[i]=0;
                    i++;
                }
            }
        }
        for (int i = pat.length(); i < dp.length; i++) {
            if(dp[i]==pat.length())
                System.out.println(i-2*pat.length());
        }
    }
}
