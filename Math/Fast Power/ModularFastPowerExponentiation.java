public class ModularFastPowerExponentiation{
  public static void main(String[] args){
    long a=2, n=16, ans=1, mod=1_000_000_007L;
    a%=mod;
    while(n>0){
      if((n&1)==1){
        ans=(ans*a)%mod;
      }
      a=(a*a)%mod;
      n>>=1;
    }
    System.out.println(ans);
  }
}