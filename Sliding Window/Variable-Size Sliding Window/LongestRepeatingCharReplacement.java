public class LongestRepeatingCharReplacement{
  public static void main(String[] args){
    String s="AABABCAAC";
    int lt=0, rt=0, maxLen=0, maxf=0, k=1, n=s.length();
    int[] map=new int[26];
    while(rt<n){
      map[s.charAt(rt)-'A'] += 1;
      maxf=Math.max(maxf,map[s.charAt(rt)-'A']);
      if((rt-lt+1)-maxf > k){
        map[s.charAt(lt)-'A'] -= 1;
        lt++;
      }
      maxLen=Math.max(maxLen,rt-lt+1);
      rt++;
    }
    System.out.println(maxLen);
  }
}