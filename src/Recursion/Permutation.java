package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String str="abca";
        permutation(str,"");
    }
    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            permutation(s1+s2,ans+ch);
        }
    }
}
