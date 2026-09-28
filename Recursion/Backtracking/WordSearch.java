import java.util.List;
import java.util.ArrayList;
public class WordSearch{
  public static boolean dfs(List<List<Character>> board, String word){
int r=board.size(),c=board.get(0).size();
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        if(backtrack(i,j,0,board,word))
          return true;
    return false;
  }
  private static boolean backtrack(int r,int c,int i,List<List<Character>> board,String word){
    if(i==word.length()){
      return true;
    }
    int rows = board.size(), cln = board.get(0).size();
  if(r<0 || c<0 || r>=rows || c>=cln || board.get(r).get(c) == '#' || board.get(r).get(c) != word.charAt(i))
      return false;
  char ch=board.get(r).get(c);
  board.get(r).set(c,'#');
  boolean res = backtrack(r-1,c,i+1,board,word) || backtrack(r+1,c,i+1,board,word) || backtrack(r,c-1,i+1,board,word) || backtrack(r,c+1,i+1,board,word);
  board.get(r).set(c,ch);
  return res;
  }
  public static void main(String[] args){
    String word="ADFCE";
    List<List<Character>> board=new ArrayList<>();
    board.add(new ArrayList<>(List.of('A','B','C','E')));
    board.add(new ArrayList<>(List.of('S','F','C','S')));
    board.add(new ArrayList<>(List.of('A','D','E','E')));
    //alt: Arrays.asList();
    System.out.println(dfs(board,word));
    System.out.println(board);
  }
}