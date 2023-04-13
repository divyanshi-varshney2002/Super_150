package Dynamic_Programming;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        System.out.println(lcs("abcde","ace",0,0));
        System.out.println(lcs2("abcde","ace",5-1,3-1));
        int dp[][]=new int[5][3];
        for(int a[]:dp) Arrays.fill(a,-1);
        System.out.println(lcsTD("abcde","ace",0,0,dp));
    }
    public static int lcs(String s1,String s2,int i,int j){
        if(i==s1.length()||j==s2.length()) return 0;
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+lcs(s1,s2,i+1,j+1);
        }else{
            int fs=lcs(s1,s2,i+1,j);
            int ss=lcs(s1,s2,i,j+1);
            ans=Math.max(fs,ss);
        }
        return ans;
    }
    public static int lcs2(String s1,String s2,int i,int j){
        if(i<0||j<0) return 0;
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+lcs2(s1,s2,i-1,j-1);
        }else{
            int fs=lcs2(s1,s2,i-1,j);
            int ss=lcs2(s1,s2,i,j-1);
            ans=Math.max(fs,ss);
        }
        return ans;
    }
    public static int lcsTD(String s1,String s2,int i,int j,int [][] dp){
        if(i==s1.length()||j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+lcsTD(s1,s2,i+1,j+1,dp);//dp[i+1][j+1]
        }else{
            int fs=lcsTD(s1,s2,i+1,j,dp);//dp[i+1][j]
            int ss=lcsTD(s1,s2,i,j+1,dp);//dp[i][j+1]
            ans=Math.max(fs,ss);
        }
        return dp[i][j]=ans;
    }
}
