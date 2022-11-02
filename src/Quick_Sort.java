import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,8,-11};
//        int[] ans=sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
        int pi=partition(arr,si,ei);
        sort(arr,si,pi-1);
        sort(arr,pi+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int item=arr[ei];
        int pi=si;
        for (int i = si; i < ei; i++) {
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
