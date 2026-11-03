import java.util.Deque;
import java.util.ArrayDeque;
public class SumOfSubarrayMinimum{
  public static int sumOfSubarrayMinimum(int[] arr){
    int n=arr.length, total=0;
    int mod=(int)1e9+7;
    int pse[]=findPSE(arr);
    int nse[]=findNSE(arr);
    for(int i=0;i<n;i++){
      int lt=i-pse[i];
      int rt=nse[i]-i;
    total=(total+(lt*rt*arr[i])%mod)%mod;
    }
    return total;
  }
  public static int[] findNSE(int[] arr){
    int n=arr.length;
    Deque<Integer> stack=new ArrayDeque<>();
    int[] nse=new int[n];
    for(int i=n-1;i>=0;i--){
      while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
        stack.pop();
      }
      nse[i]=stack.isEmpty()?n:stack.peek();
      stack.push(i);
    }
    return nse;
  }
  public static int[] findPSE(int[] arr){
    int n=arr.length;
    Deque<Integer> stack=new ArrayDeque<>();
    int[] pse=new int[n];
    for(int i=0;i<n;i++){
      while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
        stack.pop();
      }
      pse[i]=stack.isEmpty()?-1:stack.peek();
      stack.push(i);
    }
    return pse;
  }
  public static void main(String[] args){
    int[] arr={1,4,6,7,3,7,8,1};
    int sum=sumOfSubarrayMinimum(arr);
    System.out.println(sum);
  }
}