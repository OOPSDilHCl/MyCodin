import java.util.Map;
import java.util.HashMap;
public class FruitIntoBaskets{
  public static void main(String[] args){
    int[] fruits={1,2,3,2,2,3};
    int lt=0, rt=0, maxLen=0, n=fruits.length;
    Map<Integer,Integer> map=new HashMap<>();
    while(rt < n){
      map.put(fruits[rt],map.getOrDefault(fruits[rt],0) + 1);
      while(map.size()>2){
        map.put(fruits[lt],map.get(fruits[lt])-1);
        if(map.get(fruits[lt])==0)
         map.remove(fruits[lt]);
         lt++;
      }
      if(map.size()<=2){
        maxLen=Math.max(maxLen,rt-lt+1);
      }
      rt++;
    }
    System.out.println(maxLen);
  }
}