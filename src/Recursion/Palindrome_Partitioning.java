package Recursion;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String str="nitin";
        Partitioning(str,"");
    }
    public static void Partitioning(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <=ques.length() ; cut++) {
            String s=ques.substring(0,cut);
            Partitioning(ques.substring(cut),ans+s+"|");
        }
    }
}
