import java.util.Map;
import java.util.HashMap;
public class SubstringsWithExactlyKCharacters{
  public static int atMostK(String s,int k){
    Map<Character,Integer> map=new HashMap<>();
    int lt=0,rt=0,len=s.length(),total=0;
    for(;rt<len;rt++){
      map.put(s.charAt(rt),map.getOrDefault(s.charAt(rt),0)+1);
      while(map.size()>k){
        map.put(s.charAt(lt),map.get(s.charAt(lt))-1);
        if(map.get(s.charAt(lt))==0){
          map.remove(s.charAt(lt));
        }
        lt++;
      }
      total+=rt-lt+1;
    }
    return total;
  }
  public static void main(String[] arfs){
    String s="pqpqs";
  int exactlyK=atMostK(s,2)-atMostK(s,1);
    System.out.println(exactlyK);
  }
}