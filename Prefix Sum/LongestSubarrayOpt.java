import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
//for negative numbers also.
public class LongestSubarrayOpt{
  public static void main(String args[]){
  int[] arr={1,4,0,5,1,-4,6,2,1,6};
int len=arr.length,prefixSum=0,longest=0,k=5;
Map<Integer,Integer> map=new HashMap<>();
  map.put(0,-1);
  for(int i=0;i<len;i++){
    prefixSum+=arr[i];
    if(map.containsKey(prefixSum-k)){
      longest=Math.max(longest,i-map.get(prefixSum-k));
    }
    map.putIfAbsent(prefixSum,i);
  }
  System.out.println(longest);
 }
}