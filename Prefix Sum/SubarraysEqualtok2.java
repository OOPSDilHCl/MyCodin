import java.util.HashMap;
import java.util.Map;
public class SubarraysEqualtok2{
  //For all integers.
  public static void main(String[] args){
    int[] arr={1,-1,1};
    int len=arr.length,c=0,k=1,prefixsum=0;
    Map<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    for(int i=0;i<len;i++){
      prefixsum+=arr[i];
      if(map.containsKey(prefixsum-k)){
        c+=map.get(prefixsum-k);
      }
      map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
    }
    System.out.println(c);
  }
}