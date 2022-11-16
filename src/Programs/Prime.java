package Programs;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(31));
    }
    public static boolean isPrime(int n){
        int div=2;
        while (div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
