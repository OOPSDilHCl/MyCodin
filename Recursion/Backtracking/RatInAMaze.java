import java.util.List;
import java.util.ArrayList;
public class RatInAMaze{
  public static void mazeSolver(int row, int cln, int[][] maze, StringBuilder sb, int n, List<String> answer){
    if(row<0 || cln<0 || row>=maze.length || cln>=maze[0].length || maze[row][cln] == 0) return;
    if(row==n-1 && cln==n-1){
      answer.add(sb.toString());
      return;
    }
    maze[row][cln]=0;
    sb.append("D");
mazeSolver(row+1,cln,maze,sb,n,answer);
    sb.deleteCharAt(sb.length()-1);
    sb.append("U");
mazeSolver(row-1,cln,maze,sb,n,answer);
    sb.deleteCharAt(sb.length()-1);
    sb.append("L");
mazeSolver(row,cln-1,maze,sb,n,answer);
    sb.deleteCharAt(sb.length()-1);
    sb.append("R");
mazeSolver(row,cln+1,maze,sb,n,answer);
    sb.deleteCharAt(sb.length()-1);
    maze[row][cln]=1;
  }
  public static void main(String[] args){
    int n=4;
    int[][] maze={
      {1,0,0,0},
      {1,1,0,1},
      {1,1,0,0},
      {0,1,1,1}
    };
   List<String> answer=new ArrayList<>();
 mazeSolver(0,0,maze,new StringBuilder(), n, answer);
    System.out.println(answer);
  }
}