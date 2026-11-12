import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class PrimeFactorisation{
public static List<Integer> sieve(int n){
    boolean[] isPrime=new boolean[n+1];
    Arrays.fill(isPrime,true);
    isPrime[0]=false;
    if(n>=1) isPrime[1]=false;
    for(int i=2;i*i<=n;i++){
      if(isPrime[i]){
        for(int j=i*i;j<=n;j+=i){
          isPrime[j]=false;
        }
      }
    }
    List<Integer> primes=new ArrayList<>();
    for(int i=0;i<n;i++){
      if(isPrime[i]){
        primes.add(i);
      }
    }
    return primes;
  }
  public static List<Integer> factorize(int num, List<Integer> primes){
    List<Integer> factors=new ArrayList<>();
    for(int p:primes){
      while(num%p==0){
        factors.add(p);
        num/=p;
      }
    }
    if(num>1) factors.add(num);
    return factors;
  }
  public static void main(String[] args){
    int[] arr={12,7,4,6,35,22,360};
    int max=0;
    for(int x:arr) max=Math.max(max,x);
    List<Integer> primes=sieve((int) Math.sqrt(max)+1);
    List<List<Integer>> res=new ArrayList<>();
    for(int x:arr) res.add(factorize(x,primes));
    System.out.println(res);
  }
}