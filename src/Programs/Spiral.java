package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printSpiral(arr);

        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void printSpiral(int arr[][]){
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int c=0;
//        int te
//        while(1) {
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i]);
            }
            minr++;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc]);
            }
            minc--;
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i]);
            }
            minr++;
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[minr][i]);
            }
            minr++;
//        }
    }
}
