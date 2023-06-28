package Bit_Masking;

import java.util.*;
public class preparing_olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(countcontest(arr,l,r,x));
    }
    public static int countcontest(int arr[],int l,int r,int x){
        int n=arr.length;
        int ans=0;
        for (int i = 3; i < (1<<n); i++) {
            if(countsetbit(i)>=2){
                if(isitpossible(arr,l,r,x,i))
                    ans++;
            }
        }
        return ans;
    }
    public static int countsetbit(int n) {
        int c=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
    public static boolean isitpossible(int arr[],int l,int r,int x,int i){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int pos=0;
        while (i>0){
            if((i&1)!=0){
                sum=sum+arr[pos];
                min=Math.min(arr[pos],min);
                max=Math.max(arr[pos],max);
            }
            i>>=1;
            pos++;
        }
        return (sum>=l & sum<=r && (max-min)>=x);
    }
}
