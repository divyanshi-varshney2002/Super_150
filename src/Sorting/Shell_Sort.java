package Sorting;

import java.util.Arrays;

public class Shell_Sort {
    public static void shellsort(int a[],int n){
        int d,temp,i;
        d=n/2;
        while(d>=1){
            for(i=0;i<n-d;i++){
                if(a[i]>a[i+d]){
                    temp=a[i];
                    a[i]=a[i+d];
                    a[i+d]=temp;
                }
            }
            if(d==1)return;
            d= (int) Math.floor((d/2.0)+0.5);
        }
    }
    public static void main(String[] args) {
        int a[]={12,9,-10,22,2,35,40};
        shellsort(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
