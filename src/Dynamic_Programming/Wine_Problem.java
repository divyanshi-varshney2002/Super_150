package Dynamic_Programming;

public class Wine_Problem {
    public static void main(String[] args) {
        int [] wine={2,3,5,1,4};
        System.out.println(MaxProfit(wine,0,wine.length-1,1));
    }
    public static int MaxProfit(int wine[],int i,int j,int year){
        if(i>j) return 0;
        int first =wine[i]*year+MaxProfit(wine,i+1,j,year+1);
        int last =wine[j]*year+MaxProfit(wine,i,j-1,year+1);
        return Math.max(first,last);
    }
//    public static int MaxProfitBU(int wine[]){
//        int dp[][] =new int
//    }
}
