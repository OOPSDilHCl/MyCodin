public class DivideTwoNumWithoutMultiplication_Division_{
  int divide(int dividend, int divisor){
    boolean negative=(dividend<0)^(divisor<0);
    long absDividend=Math.abs((long) dividend);
    long absDivisor=Math.abs((long) divisor);
    int quotient=0;
    for(int shift=31;shift>=0;shift--){
      long chunk=absDivisor<<shift;
      if(chunk<=absDividend){
        absDividend -= chunk;
        quotient += 1L<<shift;
      }
    }
    long result = negative ? -quotient:quotient;
    if(result > Integer.MAX_VALUE)
      return Integer.MAX_VALUE;
    else if(result < Integer.MIN_VALUE)
      return Integer.MIN_VALUE;
    return (int)result;
  }
  public static void main(String[] args){
    DivideTwoNumWithoutMultiplication_Division_ sol=new DivideTwoNumWithoutMultiplication_Division_();
    int ans=sol.divide(28,5);
    System.out.println(ans);
  }
}