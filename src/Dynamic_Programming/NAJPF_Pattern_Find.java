package Dynamic_Programming;

import java.util.ArrayList;

public class NAJPF_Pattern_Find {
    public static void RabinKarp(String s,String t){
        long mod=1000_000_007;
        long pow=1;
        long hv=0;
        int pr=31;
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            hv=(hv+((ch-'a'+1)*pow)%mod)%mod;
            hv=(hv+mod)%mod;
            pow=(pow*pr)%mod;
        }
        long[] dp=new long[s.length()];
        long[] pa=new long[s.length()];
        dp[0]=s.charAt(0)-'a'+1;
        pa[0]=1;
        pow=pr;
        for (int i = 1; i < pa.length; i++) {
            char ch=t.charAt(i);
            dp[i]=dp[i-1]+((ch-'a'+1)*pow%mod)%mod;
            pa[i]=pow;
            pow=(pow*pr)%mod;
        }
        ArrayList<Integer> ll=new ArrayList<>();
        if(dp[t.length()-1]==hv) ll.add(1);

        for()
        if(ll.size()==0) System.out.println("Not Found");
        else ll.size();

        for(int i=0;i<ll.size();i++){

        }
    }
}
