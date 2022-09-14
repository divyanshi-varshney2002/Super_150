import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<=s.length();j++){
//                String str=s.substring(i,j);
//                System.out.println(str+" ");
//            }
//            System.out.println();
//        }
        int i=0;
        while(i<=s.length()){
            for(int j=0;j<s.length()-i+1;j++)
                System.out.println(s.substring(j,i+j));
            i++;
        }
//        int arr[]={2,3,-1,4,7,11,9};
//        int min=arr[0];
//        int index=0;
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min) {
//                min=arr[i];index=i;
//            }
//        }
//        System.out.println(index);
//        String s1= sc.nextLine();
//        String s2=sc.next();

//        for(int i=0;i<s1.length();i++){
//            if(s1.charAt(i)>s2.charAt(i)) {   System.out.println("+1"); return;}
//            else if(s1.charAt(i)<s2.charAt(i)) {   System.out.println("-1"); return;}
//        }

//        if(s1.length()>s2.length()){ System.out.println("+1"); return ;}
//        else if(s1.length()<s2.length()) {System.out.println("-1"); return;}
//        else    System.out.println("0"); return;

//        System.out.println(s1.length()-s2.length());
//        s1.trim();
//        System.out.println(s1);
    }
}
