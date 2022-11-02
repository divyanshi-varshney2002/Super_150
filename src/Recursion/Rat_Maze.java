package Recursion;

import java.util.Scanner;

public class Rat_Maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        for(int i=0;i<arr.length;i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int ans[][]=new int[n][m];
        find(arr,0,0,ans);
    }
    public static void find(char arr[][],int curr_column,int curr_row,int[][] ans){
        if(curr_row== arr.length-1 && curr_column==arr[0].length-1&&arr[curr_row][curr_column]!='X'){
            ans[curr_row][curr_column]=1;
//            Display(ans);
            for(int i=0;i<ans.length;i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
            return;

        }
        if (curr_column<0 || curr_column>=arr[0].length ||curr_row<0 ||curr_row>=arr.length||arr[curr_row][curr_column]=='X'){
            return;
        }
        arr[curr_row][curr_column]='X';
        ans[curr_row][curr_column]=1;
        find(arr, curr_column, curr_row-1,ans);//up
        find(arr, curr_column, curr_row+1,ans);//dowm
        find(arr, curr_column-1, curr_row,ans);//left
        find(arr, curr_column+1, curr_row,ans);//right
//        int C[]={-1,1,0,0};
//        int R[]={0,0,-1,1};
//        for(int i=0;i<R.length;i++)
//        {
//            find(arr, curr_column+C[i], curr_row+R[i],ans);
//        }
        arr[curr_row][curr_column]='0';
        ans[curr_row][curr_column]=0;
    }
    public static void Display(int[][] ans){
        for(int i=0;i<ans.length;i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

