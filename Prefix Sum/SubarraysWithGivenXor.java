import java.util.Map;
import java.util.HashMap;
public class SubarraysWithGivenXor{
  public static void main(String[] args){
    int arr[]={4,2,4,2,4},len=arr.length,k=6,prefixXor=0,count=0;
    Map<Integer,Integer> map=new HashMap<>();
    map.put(0,1);
    for(int i=0;i<len;i++){
      prefixXor^=arr[i];
      if(map.containsKey(prefixXor^k)){
        count+=map.get(prefixXor^k);
      }
      map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
    }
    System.out.println(count);
  }
}