package Recursion;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.next();
        per(str,"");
        System.out.println((int)Math.pow(2,str.length()));
        System.out.println(countper(str,""));
    }
    public static void per(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        per(ques.substring(1),ans);
        per(ques.substring(1),ans+ch);
    }
    public static int countper(String ques,String ans){
        if(ques.length()==0){
//            System.out.println(ans);
            return 1;
        }
        char ch=ques.charAt(0);
        int ans1 =countper(ques.substring(1),ans);
        int ans2=countper(ques.substring(1),ans+ch);
        return ans1+ans2;
    }
}
