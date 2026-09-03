import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution{
  public List<Character> frequencySort(String s){
    Pair[] freq=new Pair[26];
    for(int i=0;i<26;i++){
      freq[i]=new Pair(0,(char)('a'+i));
    }
    for(char ch:s.toCharArray()){
      freq[ch-'a'].freq++;
    }
    Arrays.sort(freq,(p1,p2)->{
      if(p1.freq!=p2.freq){
      return p2.freq-p1.freq;//descending
      }
      return p1.ch-p2.ch;//ascending
    });
   List<Character> res=new ArrayList<>();
   for(Pair p:freq){
     if(p.freq>0){
       res.add(p.ch);
     }
   }
   return res;
  }
  class Pair{
    int freq;
    char ch;
    Pair(int freq,char ch){
      this.freq=freq;
      this.ch=ch;
    }
  }
}
public class SortCharByFrequency{
  public static void main(String[] args){
    Solution sol=new Solution();
    String s="tree";
    List<Character> result=sol.frequencySort(s);
    System.out.println(result);
  }
}