package Sorting;

public class Heap_Sort {
    public static void main(String[] args) {
        int arr[]={4,10,2,1,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    private static void heapsort(int[] arr) {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--) heapify(arr,n,i);
        for(int i=n-1;i>0;i--){
            int t=arr[i];
            arr[i]=arr[0];
            arr[0]=t;
            heapify(arr,i,0);
        }
    }
    private static void heapify(int[] arr, int n, int pi) {
        int max=pi;
        int lci=2*pi+1;
        int rci=2*pi+2;
        if(lci<n && arr[lci]>arr[max]) max=lci;
        if(rci<n && arr[rci]>arr[max]) max=rci;
        if(max!=pi){
            int t=arr[pi];
            arr[pi]=arr[max];
            arr[max]=t;
            heapify(arr,n,max);
        }
    }
}
