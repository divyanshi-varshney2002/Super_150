package Stack;

import java.util.Stack;

public class Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String str="DDIDDDI";
        System.out.println(FormNumber(str));
    }
    public static String FormNumber(String s){
        int ans[]= new int[s.length()+1];
        Stack<Integer> st=new Stack<>();
        int count=1;
        for (int i = 0; i <= s.length(); i++) {
            if(i==s.length()|| s.charAt(i)=='I'){
                ans[i]=count++;
                while (!st.isEmpty()){
                    ans[st.pop()]=count++;
                }
            }
            else
                st.push(i);
        }
        String str="";
        for(int val:ans){
            str+=val;
        }
        return str;
    }
}
