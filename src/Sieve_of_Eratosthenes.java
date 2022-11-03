public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=100;
        PrimeSieve(n);
    }
    public static void PrimeSieve(int n){
        //kisi index pe false set hai to us index ko prime consider krna h
        //kisi index pe true set hai to us index ko not prime consider krna h
        boolean arr[]=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i*i < arr.length; i++) {
            if (arr[i]==false){
                for (int j = 2; i*j <= n; j++) {
                    arr[i*j]=true;//not prime set
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==false)
            System.out.print(i+" ");
        }
    }
}
