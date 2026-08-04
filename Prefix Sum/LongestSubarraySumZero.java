import java.util.Map;
import java.util.HashMap;
public class LongestSubarraySumZero{
  public static void main(String args[]){
    int arr[]={0,0,1,7,-2,-1,-4,7,0},len=arr.length,prefixSum=0,max=0;
Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<len;i++){
      prefixSum+=arr[i];
      if(prefixSum==0){
        max=i+1;
      }
      else{
        if(map.containsKey(prefixSum)){
          max=Math.max(max,i-map.get(prefixSum));
        }
        else{
          map.putIfAbsent(prefixSum,i);
        }
      }
    }
    System.out.println(max);
  }
}