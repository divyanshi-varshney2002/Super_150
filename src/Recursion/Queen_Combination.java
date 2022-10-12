package Recursion;

public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        Answer(board,tq,0,0,"");
    }
    public static void Answer(boolean[] board,int tq,int Q_placesofar,int idx,String ans) {
        if (Q_placesofar == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
//                Q_placesofar+=1;
                Answer(board, tq, Q_placesofar + 1, i + 1, ans + "b" + i + "q" + Q_placesofar);
//                Q_placesofar-=1;
                board[i] = false;
                //explicitly undo
                //forcefully undo steps are in backtracking
            }
        }
    }
}
