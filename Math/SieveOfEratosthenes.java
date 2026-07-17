import java.util.Arrays;
public class SieveOfEratosthenes{
  public static void main(String[] args){
    boolean[] isPrime=new boolean[101];
    Arrays.fill(isPrime,true);
    //Fills the array true.
    isPrime[0]=false;
    isPrime[1]=false;
    for(int i=2;i*i<=100;i++){
      if(isPrime[i]){
        for(int j=i*i;j<=100;j+=i){
          isPrime[j]=false;
        }
      }
    }
    for(int i=0;i<=100;i++){
      if(isPrime[i])
      System.out.print(i+" ");
    }
  }
}