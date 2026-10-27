import java.util.Map;
import java.util.HashMap;
public class SubarraysWithKDistinctIntegers{
  public static int atMost(int[] arr, int k){
    int n=arr.length, lt=0, cnt=0;
    Map<Integer,Integer> map=new HashMap<>();
    for(int rt=0; rt<n; rt++){
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
      while(map.size()>k){
        map.put(arr[lt],map.get(arr[lt])-1);
        if(map.get(arr[lt])==0){
          map.remove(arr[lt]);
        }
        lt++;
      }
      cnt += rt-lt+1;
    }
    return cnt;
  }
  public static void main(String[] args){
    int arr[]={6,1,2,3,1}, k=2;
    System.out.println(atMost(arr,k)-atMost(arr,k-1));
  }
}