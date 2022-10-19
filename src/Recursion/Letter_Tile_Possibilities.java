package Recursion;

public class Letter_Tile_Possibilities {
    public static void main(String[] args) {
        String s="AAB";
        int freq[]=new int[26];
        count(s,freq);
        System.out.println(Tile_Possibilities(freq,""));
    }
    public static int Tile_Possibilities(int[] freq,String ans){
        int c=0;
//        System.out.println(ans);
        for (int i=0;i<freq.length;i++){
            if (freq[i]>=1){
                char ch=(char) (i+'A');
                freq[i]--;
                c+=Tile_Possibilities(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return c;
    }
    public static void count(String s,int[] freq){
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
        }
//        System.out.println(Arrays.toString(freq));
    }
}
