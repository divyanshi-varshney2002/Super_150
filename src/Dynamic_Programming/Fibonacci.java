package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=25;
        int [] dp=new int[n+1];
        System.out.println(fiboTD(n,dp));
        System.out.println(Arrays.toString(dp));

        System.out.println(fiboBU(n));
        //ye wala jyada time lega than the dp
        //agar bada input h toh
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==1||n==0) return n;
        int f1=fibo(n-1);
        int f2=fibo(n-2);
        return f1+f2;
    }
    //Top down (TD) memorization ho raha h using array (dp)
    public static int fiboTD(int n,int [] dp){
        if(n==1||n==0) return n;
        if(dp[n]!=0) return dp[n]; // dp apply kari h
        int f1=fiboTD(n-1,dp);
        int f2=fiboTD(n-2,dp);
        return dp[n]=f1+f2;
    }
    public static int fiboBU(int n){
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <dp.length ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
// agar precomputed h toh stored value(memorized value) return kr denge jisse ki time bachega
// phle complexity thi O(2^n) after use of dp O(n)