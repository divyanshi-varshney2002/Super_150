package Dynamic_Programming;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(robberTD(arr,0,dp));
        System.out.println(robberBU(arr));
        System.out.println(robber(arr,0));
    }
    //recursion
    public static int robber(int[] arr,int i) {
         if(i>=arr.length) return 0;
         int rob=arr[i]+robber(arr,i+2);
         int dontrob=robber(arr,i+1);
         return Math.max(rob,dontrob);
    }
    ///top down
    public static int robberTD(int[] arr,int i,int dp[]) {
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return  dp[i];
        int rob=arr[i]+robberTD(arr,i+2,dp);
        int dontrob=robberTD(arr,i+1,dp);
        return dp[i]=Math.max(rob,dontrob);
    }
    //bottom up
    public static int robberBU(int[] arr) {
        if(arr.length==1) return arr[0];
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int rob=dp[i-2]+arr[i];
            int dontrob=dp[i-1];
            dp[i]=Math.max(rob,dontrob);
        }
        return dp[arr.length-1];
    }
}
//    You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
//    the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
//    and it will automatically contact the police if two adjacent houses were broken into on the same night.
//    Given an integer array nums representing the amount of money of each house,
//    return the maximum amount of money you can rob tonight without alerting the police.
