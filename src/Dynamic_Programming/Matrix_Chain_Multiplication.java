package Dynamic_Programming;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {

    }
    public static int mcm(int arr[],int si,int ei){
        if(si+1==ei) return 0;
        int ans=Integer.MAX_VALUE;
        for (int k = si+1; k <ei ; k++) {
            int fs=mcm(arr,si,k);
            int ss=mcm(arr,k,ei);
            int rs=arr[si]*arr[k]*arr[ei];
            ans=Math.min(ans,fs+ss+rs);
        }
        return ans;
    }
}
