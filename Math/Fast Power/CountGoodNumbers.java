public class CountGoodNumbers{
  public static final long MOD=1_000_000_007L;
  public static long fastPower(int base,int exp){
    if(exp==0){
      return 1;
    }
    long half=fastPower(base,exp/2);
    half=(half*half)%MOD;
    if(exp%2==1){
      half=(half*base)%MOD;
    }
    return half;
  }
  public static void main(String[] args){
    int n=5;
    int even_ways=(n+1)/2,prime_ways=n/2;
    System.out.println((fastPower(5,even_ways)*fastPower(4,prime_ways))%MOD);
  }
}