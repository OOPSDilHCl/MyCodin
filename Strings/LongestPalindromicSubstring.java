//Manacher's Algorithm
public class LongestPalindromicSubstring{
  public static void main(String[] args){
    String s="baabadc";
    if(s==null||s.length()==0){
      return;
    }
 StringBuilder sb=new StringBuilder("^");
    for(char ch : s.toCharArray()){
      sb.append("#").append(ch);
    }
    sb.append("#$");
    String t=sb.toString();
    /*Use StringBuilder otherwise Using normal String to make t would make new String Object each iteration since strings are immutable and thus n copy of string in each iterations n times thus O(n²) time complexity!*/
    int len=t.length(),center=0,rt=0;
    int[] p=new int[len];
    for(int i=1;i<len-1;i++){
      int mirror=2*center-i;
      if(i<rt){
        p[i]=Math.min(rt-i,p[mirror]);
      }
      while(t.charAt(i+p[i]+1)==t.charAt(i-p[i]-1)){
        p[i]++;
      }
      if(i+p[i]>rt){
        center=i;
        rt=i+p[i];
      }
    }
    int maxLen=0,centerIndex=0;
    for(int i=1;i<len-1;i++){
      if(maxLen<p[i]){
        maxLen=p[i];
        centerIndex=i;
      }
    }
    int start=(centerIndex-maxLen)/2;
    System.out.println(s.substring(start,start+maxLen));
  }
}