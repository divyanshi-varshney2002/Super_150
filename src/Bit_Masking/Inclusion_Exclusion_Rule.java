package Bit_Masking;

import java.util.Scanner;

public class Inclusion_Exclusion_Rule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(); // n=1000
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++) arr[i]=sc.nextInt();  //{2,3,5}
        System.out.println(count(n,arr));
    }
    public static int count(int n,int arr[]){
        int ans=0;
        for (int i = 1; i < (1<< arr.length); i++) {
            int c=countnumber(i,n,arr);
            if(countsetbit(i)%2==0) ans=ans-c;
            else ans=ans+c;
        }
        return ans;
    }
    public static int countnumber(int i,int n,int arr[]){
        int pod=1;
        int pos=0;
        while(i>0){
            if((i&1)!=0){
                pod=pod*arr[pos];
            }
            i=i>>1;
            pos++;
        }
        return n/pod;
    }
    public static int countsetbit(int n) {
        int c=0;
        while(n>0){
            n=(n&(n-1));
            c++;
        }
        return c;
    }
}
