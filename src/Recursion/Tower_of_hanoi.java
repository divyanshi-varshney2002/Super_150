package Recursion;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        int n=5;
        String src="A";
        String hlp="B";
        String des="C";
        toh(n,src,hlp,des);
    }
    public static void toh(int n,String src,String hlp,String des){
        if(n==0) return;
        toh(n-1,src,des,hlp);
        System.out.println("Move "+n+"th disc from "+src+" to "+des);
        toh(n-1,hlp,src,des);
    }
}