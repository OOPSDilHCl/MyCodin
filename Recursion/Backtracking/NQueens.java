import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class NQueens{
  public static void solveNQueens(List<List<String>> result, int n){
    char[][] board=new char[n][n];
    int len=board.length;
    int[] usedColumn=new int[n];
   int[] usedLeftDiagonal=new int[2*n-1];
  int[] usedRightDiagonal=new int[2*n-1];
    for(int i=0;i<len;i++){
      Arrays.fill(board[i],'.');
    }
  backtrack(0,board,result,n,usedColumn,usedLeftDiagonal,usedRightDiagonal);
  }
  private static void backtrack(int row, char[][] board, List<List<String>> result, int n, int[] usedColumn, int[] usedLeftDiagonal, int[] usedRightDiagonal){
    if(row==n){
      result.add(constructBoard(board));
      return;
    }
    for(int cln=0;cln<n;cln++){
    if(usedColumn[cln]==1 || usedLeftDiagonal[row-cln+n-1]==1 || usedRightDiagonal[row+cln]==1){
        continue;
      }
      board[row][cln]='Q';
      usedColumn[cln]=1;
      usedLeftDiagonal[row-cln+n-1]=1;
      usedRightDiagonal[row+cln]=1;
      backtrack(row+1,board,result,n,usedColumn,usedLeftDiagonal,usedRightDiagonal);
      board[row][cln]='.';
      usedColumn[cln]=0;
      usedLeftDiagonal[row-cln+n-1]=0;
      usedRightDiagonal[row+cln]=0;
    }
  }
  private static List<String> constructBoard(char[][] board){
    List<String> list=new ArrayList<>();
    for(char[] boardRow:board){
      list.add(new String(boardRow));
    }
    return list;
  }
  public static void main(String[] args){
    int n=14;
    List<List<String>> result=new ArrayList<>();
    if(n<=0) return;
    solveNQueens(result,n);
    System.out.println(result);
    System.out.println(result.size());
  }
}