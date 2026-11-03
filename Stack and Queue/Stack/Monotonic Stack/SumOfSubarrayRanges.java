import java.util.Deque;
import java.util.ArrayDeque;
public class SumOfSubarrayRanges{
  public static int sumOfSubarrayMaximum(int[] arr){
    int n=arr.length;
    long total=0L;
    int[] pge=findPGE(arr);
    int[] nge=findNGE(arr);
    for(int i=0;i<n;i++){
      int left=i-pge[i];
      int right=nge[i]-i;
      total += left*right*arr[i];
    }
    return (int)total;
  }
  public static int[] findNGE(int[] arr){
    int n=arr.length;
    int[] nge=new int[n];
    Deque<Integer> stack=new ArrayDeque<>();
    for(int i=n-1;i>=0;i--){
      while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
        stack.pop();
      }
      nge[i]=stack.isEmpty()?n:stack.peek();
      stack.push(i);
    }
    return nge;
  }
  public static int[] findNSE(int[] arr){
    int n=arr.length;
    int[] nse=new int[n];
    Deque<Integer> stack=new ArrayDeque<>();
    for(int i=n-1;i>=0;i--){
      while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
        stack.pop();
      }
      nse[i]=stack.isEmpty()?n:stack.peek();
      stack.push(i);
    }
    return nse;
  }
  public static int[] findPGE(int[] arr){
    int n=arr.length;
    int[] pge=new int[n];
    Deque<Integer> stack=new ArrayDeque<>();
    for(int i=0;i<n;i++){
      while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
        stack.pop();
      }
      pge[i]=stack.isEmpty()?-1:stack.peek();
      stack.push(i);
    }
    return pge;
  }
  public static int[] findPSE(int[] arr){
    int n=arr.length;
    int[] pse=new int[n];
    Deque<Integer> stack=new ArrayDeque<>();
    for(int i=0;i<n;i++){
      while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
        stack.pop();
      }
      pse[i]=stack.isEmpty()?-1:stack.peek();
      stack.push(i);
    }
    return pse;
  }
  public static int sumOfSubarrayMinimum(int[] arr){
    int n=arr.length;
    long total=0L;
    int[] pse=findPSE(arr);
    int[] nse=findNSE(arr);
    for(int i=0;i<n;i++){
      int left=i-pse[i];
      int right=nse[i]-i;
      total += left*right*arr[i];
    }
    return (int)total;
  }
  public static void main(String[] args){
    int[] arr={4, -2, -3, 4, 1};
    System.out.println(sumOfSubarrayMaximum(arr) - sumOfSubarrayMinimum(arr));
  }
}