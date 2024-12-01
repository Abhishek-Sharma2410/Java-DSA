public class nqueens{
    public static void nQueens(char chessBoard[][], int row){
        if(row==chessBoard.length){
            printChessBoard(chessBoard);
            // count++;
            return;
        }
        for(int i=0; i<chessBoard[0].length; i++){
            if(isSafe(chessBoard, row, i)){
                chessBoard[row][i] = 'Q';
                nQueens(chessBoard, row+1);
                chessBoard[row][i] = 'X';
            }
        }
    }
    // static int count = 0;
    public static boolean isSafe(char chessBoard[][], int row, int col){
        for(int i=row-1; i>=0; i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<chessBoard[0].length; i--, j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printChessBoard(char chessBoard[][]){
        System.out.println("------------Chess Board-------------");
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard[0].length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard[0].length; j++){
                chessBoard[i][j] = 'X';
            }
        }
        nQueens(chessBoard, 0);
        // System.out.println(count);
    }
}