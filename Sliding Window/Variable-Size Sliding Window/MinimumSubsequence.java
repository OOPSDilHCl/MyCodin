public class MinimumSubsequence{
  public static void main(String[] args){
    String s1="abbbbdbeefvbce", s2="bde";
    int m=s1.length(), n=s2.length(), minLen=Integer.MAX_VALUE, end=0, rt=0, i=0, cnt=n, start=-1;
    while(rt<m){
      if(s1.charAt(rt)==s2.charAt(i)){
        i++;
        cnt--;
      }
      if(cnt==0){
        end=rt;
        i--;
        while(i>=0){
         if(s1.charAt(rt)==s2.charAt(i)){
            i--;
          }
          rt--;
        }
        rt++;//Now at starting posn
        if(end-rt+1<minLen){
          minLen=end-rt+1;
          start=rt;
        }
        i=0;
        cnt=n;
      }
      rt++;
    }
    if(start==-1){
      System.out.println("");
    }else{
      System.out.println(s1.substring(start,end+1));
    }
  }
}