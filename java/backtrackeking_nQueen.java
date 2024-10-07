public class backtrackeking_nQueen {
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for (int i = row-1; i >=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //diagonal right up
        for (int i = row-1,j=col+1; i>=0 && j< board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
            
        }
        return true;
    }
    public static boolean nqueen(char board[][],int row ) {
        
            if (row==board.length) {
                //here print the bourd solution
             //   printboard(board);
                //count the number of solution
                count++;
                return true;
            }
            for (int j = 0; j < board.length; j++) {
        
                if (issafe(board, row, j)){
                board[row][j] = 'Q';
               if(nqueen(board, row+1)){
                return true;
               }
                board[row][j]='x';
        
            }
        }
        return false;
    }
        public static void printboard(char board[][]){
            System.out.println("_________chess board________");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
          
        }
    static int count=0;
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for ( int j = 0; j < n; j++) {
                board[i][j]='x';
            }
        }
        if(nqueen(board,0)){
            System.out.println("solution is possible");
            printboard(board);
        }else{
            System.out.println("solution is not possible");
        }
       // System.out.println("the number of solutions" +" "+ count);
    }
}
