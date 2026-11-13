import java.util.Arrays;
public class PrimeInRangeLToR{
  public static int[] findSieve(int n){
    int[] isPrime=new int[n+1];
    Arrays.fill(isPrime,1);
    isPrime[0]=0;
    if(n>=1) isPrime[1]=0;
    for(int i=2;i*i<=n;i++){
      if(isPrime[i]==1){
        for(int j=i*i;j<=n;j+=i){
          isPrime[j]=0;
        }
      }
    }
    return isPrime;
  }
  public static void main(String[] args){
    int queries[][]={{2,5},{4,7},{0,9}}, n=queries.length, max=0;
    for(int i=0;i<n;i++){
      max=Math.max(max,queries[i][1]);
    }
    int[] prime=findSieve(max);
    for(int i=1;i<=max;i++){
      prime[i] += prime[i-1];
    }
    int[] res=new int[n];
    for(int i=0;i<n;i++){
    int l=queries[i][0], r=queries[i][1];
     if(l==0) res[i]=prime[r];
     else res[i]=prime[r]-prime[l-1];
    }
    System.out.println(Arrays.toString(res));
  }
}