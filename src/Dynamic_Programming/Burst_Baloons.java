package Dynamic_Programming;

public class Burst_Baloons {
    public static void main(String[] args) {
        int nums[]={3,1,5,8};
        int arr[]=new int[nums.length+2];
        arr[0]=arr[arr.length-1]=1;
        for (int i = 1; i < arr.length-1 ; i++) {
            arr[i]=nums[i-1];
        }
        System.out.println(burst(arr,0, arr.length-1));
        System.out.println(burstdp(arr,0, arr.length-1));
    }
    public static int burst(int arr[],int si,int ei){
        if(si+1==ei) return 0;
        int ans=Integer.MIN_VALUE;
        for(int k=si+1;k<ei;k++){
            int l=burst(arr,si,k);
            int r=burst(arr,k,ei);
            int s=arr[si]*arr[k]*arr[ei];
            ans=Math.max(ans,l+r+s);
        }
        return ans;
    }
    public static int burstdp(int arr[],int si,int ei){
        int dp[][]=new int[arr.length][arr.length];
        for(int slide=2;slide<dp.length;slide++){
            for (int j = slide; j <dp.length ; j++) {
                int i=j-slide;
                int ans=Integer.MIN_VALUE;
                for(int k=i+1;k<j;k++){
                    int l=dp[i][k];
                    int r=dp[k][j];
                    int s=arr[i]*arr[k]*arr[j];
                    ans=Math.max(ans,l+r+s);
                }
                dp[i][j]= ans;
            }
        }
        return dp[0][dp.length-1];
    }
}
