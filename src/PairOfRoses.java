import java.util.*;
public class PairOfRoses{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int money=sc.nextInt();
            Arrays.sort(arr);
            roseprice(arr,money);
            sc.nextLine();
        }
    }
    public static void roseprice(int arr[],int money){
        int rose[]=new int[2];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<money){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]+arr[i]==money && arr[j]-arr[i]<min){
                        rose[0]=arr[i];
                        rose[1]=arr[j];
                        min=arr[j]-arr[i];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+rose[0]+" and "+rose[1]+".");
        return;
    }
}