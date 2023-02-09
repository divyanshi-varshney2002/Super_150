package question;

import java.util.Scanner;

public class binary_search {
    public static int bsearch(int arr[],int item,int lo,int hi){
//        int lo=0;
//        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==item) return mid;
            else if(arr[mid]>item){
//                lo=mid+1;
                bsearch(arr,item,mid+1,hi);
            }
            else {
//                hi=mid-1;
                bsearch(arr, item, lo, mid - 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}
