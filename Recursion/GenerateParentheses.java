import java.util.List;
import java.util.ArrayList;
public class GenerateParentheses{
  public static void generateParentheses(int n,List<String> res){
    generateParentheses(n,res,0,0,"");
  }
private static void generateParentheses(int n,List<String> res,int i,int j,String braces){
   if(braces.length()==2*n){
      res.add(braces);
      return; 
   }
   if(i<n)
   generateParentheses(n,res,i+1,j,braces+"(");
   if(j<i)
   generateParentheses(n,res,i,j+1,braces+")");
  }
  public static void main(String[] args){
    int n=3;
    List<String> res=new ArrayList<>();
    generateParentheses(n,res);
    System.out.println(res);
  }
}