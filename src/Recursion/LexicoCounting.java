package Recursion;

public class LexicoCounting {
    public static void main(String[] args) {
        lexo_count(0,15);
    }
    public static void lexo_count(int curr,int n){
        if(curr>n) return;
        System.out.println(curr);
        int i=0;
        if(curr==0) i=1;
        for(;i<=9;i++){
            lexo_count(curr*10+i,n);
        }
        return;
    }
}
