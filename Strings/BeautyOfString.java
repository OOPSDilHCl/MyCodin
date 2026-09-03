public class BeautyOfString{
  public static void main(String[] args){
    String s="aabcb";
    int len=s.length(),total=0;
    for(int i=0;i<len;i++){
      int count[]=new int[26];
      int maxFreq=0;
      for(int j=i;j<len;j++){
        count[s.charAt(j)-'a']++;
        maxFreq=Math.max(maxFreq,count[s.charAt(j)-'a']);
        int minFreq=Integer.MAX_VALUE;
        for(int c : count){
          if(c>0) minFreq=Math.min(c,minFreq);
        }
        total+=maxFreq-minFreq;
      }
    }
    System.out.println(total);
  }
}