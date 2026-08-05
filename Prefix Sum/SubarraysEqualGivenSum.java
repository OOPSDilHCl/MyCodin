import java.util.Map;
import java.util.HashMap;
public class SubarraysEqualGivenSum{
  public static void main(String[] args){
    int arr[]={3,-3,-3,6,0,1,1,1,2,-2},len=arr.length,k=3,prefixSum=0,count=0;
    Map<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    for(int i=0;i<len;i++){
      prefixSum+=arr[i];
      if(map.containsKey(prefixSum-k))
       count+=map.get(prefixSum-k);
      map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
    }
    System.out.println(count);
  }
}