import java.util.Map;
import java.util.HashMap;
public class LongestSubstringAtMostKDistinctChars{
  public static void main(String[] args){
    String s="aababbcaacc";
    int k=2, lt=0, rt=0, maxLen=0, n=s.length();
    if(n==0 || s==null || k<=0){
      System.out.println(0);
      System.exit(0);
    }
    if(k>=n){
      System.out.println(n);
      System.exit(0);
    }
    Map<Character,Integer> map=new HashMap<>();
    while(rt < n){
      char c=s.charAt(rt);
      map.put(c,map.getOrDefault(c,0)+1);
      while(map.size()>k){
        char ch=s.charAt(lt);
        map.put(ch,map.get(ch)-1);
        if(map.get(ch)==0)
          map.remove(ch);
        lt++;
      }
      if(map.size()<=k){
        maxLen=Math.max(maxLen,rt-lt+1);
      }
      rt++;
    }
    System.out.println(maxLen);
  }
}