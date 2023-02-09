package question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int arr[]={1,3,7,4,7,3,8,4,9};
        merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge_sort(int arr[],int lo,int hi){
//        int lo=0;
//        int hi=arr.length-1;
        if(lo>=hi){
            return;
        }
        if(lo<hi){
            int mid=(lo+hi)/2;
            merge_sort(arr,lo,mid);
            merge_sort(arr,mid+1,hi);
            merge(arr,lo,mid,hi);
        }
        return;
    }
    public static void merge(int arr[],int lo,int mid,int hi){
        int n1=mid-lo+1;
        int n2=hi-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=arr[i+lo];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[i+mid+1];
        }
        int i=0;
        int j=0;
        int k=lo;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            k++;i++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;k++;
        }
        return;
    }
}
