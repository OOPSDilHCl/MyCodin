import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInArrays{
  public static void main(String[] args){
    int[] arr={11,8,1,2,0};
    int len=arr.length,max=Integer.MIN_VALUE;
 List<Integer> leaders=new ArrayList<>();
    for(int i=len-1;i>=0;i--){
      if(arr[i]>max){
        leaders.add(arr[i]);
      }
      max=Math.max(max,arr[i]);
    }
    Collections.reverse(leaders);
    System.out.println(leaders);
  }
}