package Bit_Masking;

import java.util.Scanner;

public class Count_good_substrings_codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        good_substring(s);
    }
    public static void good_substring(String str) {
        long arr[][] = new long[2][2];
        long odd = 0, even = 0;
        for (int i = 1; i <= str.length(); i++) {
            odd++;
            if (i % 2 != 0) {
                odd += arr[str.charAt(i - 1) - 'a'][0];
                even += arr[str.charAt(i - 1) - 'a'][1];
                arr[str.charAt(i - 1) - 'a'][0]++;
            }else{
                odd += arr[str.charAt(i - 1) - 'a'][1];
                even += arr[str.charAt(i - 1) - 'a'][0];
                arr[str.charAt(i - 1) - 'a'][1]++;
            }
        }
        System.out.println(even+" "+odd);
    }
}
//    public static boolean palincheck(String str){
//        int start=0;
//        int end=str.length()-1;
//        while(start<end){
//
//        }
//        return true;
//    }

