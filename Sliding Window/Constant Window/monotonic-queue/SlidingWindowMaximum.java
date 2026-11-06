import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class SlidingWindowMaximum{
  public static void main(String[] args){
    Deque<Integer> dq=new ArrayDeque<>();
    int arr[]={1,3,-5,7,3,8,2,9}, n=arr.length, k=3;
    int[] res=new int[n-k+1];
    for(int i=0;i<n;i++){
      if(!dq.isEmpty() && dq.peek()==i-k)
        dq.pop();
      while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
        dq.pollLast();
      }
      dq.offerLast(i);
      if(i>=k-1) res[i-k+1]=arr[dq.peek()];
    }
    System.out.println(Arrays.toString(res));
  }
}