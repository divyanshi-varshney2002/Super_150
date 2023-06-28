package Bit_Masking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Busyman_spoj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Pair arr[]=new Pair[n];
            for(int i=0;i<n;i++){
                int start=sc.nextInt();
                int end=sc.nextInt();
                arr[i]=new Pair(start,end);
            }
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.end- o2.end;
                }
            });
            int activity=1;
            int end=arr[0].end;
            for (int i = 1; i < arr.length; i++) {
                if(end<=arr[i].start){
                    activity++;
                    end=arr[i].end;
                }
            }
            System.out.println(activity);
        }
    }
    public static class Pair{
        int start;
        int end;
        public Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
}
