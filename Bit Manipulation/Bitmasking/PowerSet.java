public class PowerSet{
  public static void main(String[] args){
    String s="abcd";
    int n=s.length(),total=1<<n;
    StringBuilder sb=new StringBuilder();
    for(int mask=0;mask<total;mask++){
      sb.setLength(0);
      for(int i=0;i<n;i++){
        if((mask & (1<<i))!=0){
          sb.append(s.charAt(i));
        }
      }
      System.out.println(sb);
    }
  }
}