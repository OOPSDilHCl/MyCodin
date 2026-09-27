import java.util.List;
import java.util.ArrayList;
public class PalindromePartitioning{
  public static void partitionPalindromes(String s, List<List<String>> res){
    backtrack(0,new ArrayList<>(),s,res);
  }
  private static void backtrack(int index,List<String> curr,String s,List<List<String>> res){
    if(index==s.length()){
      res.add(new ArrayList<>(curr));
      return;
    }
    for(int i=index;i<s.length();i++){
      if(isPalindrome(s,index,i)){
        curr.add(s.substring(index,i+1));
        backtrack(i+1,curr,s,res);
        curr.remove(curr.size()-1);
      }
    }
  }
  private static boolean isPalindrome(String s,int i,int j){
    while(i<=j){
      if(s.charAt(i)!=s.charAt(j)){
        return false;
      }i++;j--;
    }
    return true;
  }
  public static void main(String[] args){
    String s="aabaa";
    List<List<String>> result=new ArrayList<>();
    partitionPalindromes(s,result);
    System.out.println(result);
  }
}