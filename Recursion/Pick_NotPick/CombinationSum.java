import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class CombinationSum{
    public static List<List<Integer>> combinationSum(int target,int... candidates) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answer,new ArrayList<>(),candidates,target,0);
            return answer;
    }
    private static void backtrack(List<List<Integer>> answer,List<Integer> ds,int[] candidates,int target,int i){
        if(target==0){
    answer.add(new ArrayList<>(ds));
    return;
        }
        if(i==candidates.length||candidates[i]>target){
            return;
        }
ds.add(candidates[i]);
backtrack(answer,ds,candidates,target-candidates[i],i);
ds.remove(ds.size()-1);
backtrack(answer,ds,candidates,target,i+1);
    }
  public static void main(String[] args){
    List<List<Integer>> result =combinationSum(7,2,3,4,5);
    System.out.println(result);
  }
}