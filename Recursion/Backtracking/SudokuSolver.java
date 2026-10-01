import java.util.Arrays;
public class SudokuSolver{
  public static boolean solve(int row,int cln,char[][] board){
    if(row==9) 
      return true;
    if(cln==9) 
      return solve(row+1,0,board);
    if(board[row][cln]!='.') 
      return solve(row,cln+1,board);
    for(char c='1';c<='9';c++){
     if(!safe(c,row,cln,board)) continue;
      board[row][cln]=c;
      if(solve(row,cln+1,board))
        return true;
      board[row][cln]='.';
    }
    return false;
  }
  public static boolean safe(char c,int row,int cln,char[][] b){
    for(int i=0;i<9;i++){
      if(b[row][i]==c||b[i][cln]==c) return false;
   if(b[3*(row/3)+i/3][3*(cln/3)+i%3]==c) return false;
    }
    return true;
  }
  public static void main(String[] args){
    char[][] board={
   {'5','3','.','.','7','.','.','.','.'},
   {'6','.','.','1','9','5','.','.','.'},
   {'.','9','8','.','.','.','.','6','.'},
   {'8','.','.','.','6','.','.','.','3'},
   {'4','.','.','8','.','3','.','.','1'},
   {'7','.','.','.','2','.','.','.','6'},
   {'.','6','.','.','.','.','2','8','.'},
   {'.','.','.','4','1','9','.','.','5'},
   {'.','.','.','.','8','.','.','7','9'},
    };
    solve(0,0,board);
    System.out.println(Arrays.deepToString(board));
  }
}