package Stack;

import java.util.Stack;
public class Stock_span {
    public static void main(String[] args) {
        int arr[]={10,2,1,3,5,4,8,7};
        NGE(arr);
    }
    public static void NGE(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while (!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=i-st.peek();
            }
            else{
                ans[i]=i+1;
            }
            st.push(i);
        }
//        while (!st.isEmpty()){
//            ans[st.pop()]=-1;
//        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" "+ans[i]);
        }
    }
}
