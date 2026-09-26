import java.util.List;
import java.util.ArrayList;
public class CombinationSumIII{
  public static void backtrack(int val,int k,int target,List<Integer> curr,List<List<Integer>> result){
    if(k==0 && target==0){
      result.add(new ArrayList<>(curr));
      return;
    }
    if(val>9 || val>target) return;
    curr.add(val);
    backtrack(val+1,k-1,target-val,curr,result);
    curr.remove(curr.size()-1);
    backtrack(val+1,k,target,curr,result);
  }
  public static void main(String[] args){
    List<List<Integer>> result=new ArrayList<>();
    backtrack(1,3,9,new ArrayList<>(),result);
    System.out.println(result);
  }
}