public class XorOfRange{
  public static long prefixXOR(long n){
    if(n<0) return 0L;
    long remainder=n%4;
    if(remainder==0)
      return n;
    else if(remainder==1)
      return 1;
    else if(remainder==2)
      return n+1;
    else
      return 0;
  }
  public static long findRangeXOR(long L, long R){
    if(L>R) return 0L;
    return prefixXOR(L-1)^prefixXOR(R);
  }
  public static void main(String[] args){
    long L=4,R=10;
   System.out.println(findRangeXOR(L,R));
  }
}