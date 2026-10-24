public class MinimumSubstring{
  public static void main(String[] args){
    String s="DcAaBFCBDA", t="ABC";
    int[] hash=new int[256];
    int n=s.length(), m=t.length(), lt=0, rt=0, minLen=Integer.MAX_VALUE, start=-1, end=0, cnt=0;
    for(int i=0;i<m;i++){
      hash[t.charAt(i)]++;
    }
    while(rt<n){
      if(hash[s.charAt(rt)]>0){
        cnt++;
      }
      hash[s.charAt(rt)]--;
      while(cnt==m){
        if(minLen > (rt-lt+1)){
          minLen=rt-lt+1;
          start=lt;
          end=rt;
        }
        hash[s.charAt(lt)]++;
        if(hash[s.charAt(lt)]>0){
          cnt--;
        }
        lt++;
      }
      rt++;
    }
    if(start==-1){
      System.out.println("No valid substring exists!");
    } else {
      System.out.println(s.substring(start,end+1));
    }
  }
}