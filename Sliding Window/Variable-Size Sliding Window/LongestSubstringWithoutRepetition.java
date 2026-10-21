import java.util.Map;
import java.util.HashMap;
public class LongestSubstringWithoutRepetition{
  public static int lengthOfLongestSubstring(String s){
    int n=s.length(), maxLen=0, lt=0;
    Map<Character,Integer> map=new HashMap<>();
    for(int rt=0;rt<n;rt++){
      char c=s.charAt(rt);
      if(map.containsKey(c) && map.get(c)>=lt){
        lt=map.get(c)+1;
      }
      map.put(c,rt);
      maxLen=Math.max(maxLen,rt-lt+1);
    }
    return maxLen;
  }
  public static void main(String[] args){
    String s="ababbcdaa";
    System.out.println(lengthOfLongestSubstring(s));
  }
}