import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=SquareRoot(n);
        System.out.println(r);
    }
    public static int SquareRoot(int n){
        int ans=0;
        int si=1;
        int ei=n;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(mid*mid<=n){
                ans=mid;
                si=mid+1;
            }
            else ei=mid-1;
        }
        return ans;
    }
}
