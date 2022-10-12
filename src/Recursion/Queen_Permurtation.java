package Recursion;

public class Queen_Permurtation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        PrintAnswer(board,tq,0,"");
    }
    public static void PrintAnswer(boolean[] board,int tq,int Q_placesofar,String ans){
        if(Q_placesofar==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
//                Q_placesofar+=1;
                PrintAnswer(board,tq,Q_placesofar+1,ans+"b"+i+"q"+Q_placesofar);
//                Q_placesofar-=1;
                board[i]=false;
                //explicitly undo
                //forcefully undo steps are in backtracking
            }
        }
    }
}
