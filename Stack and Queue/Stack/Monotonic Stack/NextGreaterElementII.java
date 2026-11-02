import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class NextGreaterElementII{
  public static void main(String[] args){
    Deque<Integer> stack=new ArrayDeque<>();
    int nge[]={5,7,1,7,6,0},N=nge.length;
    int[] res=new int[N];
    for(int i=2*N-1;i>=0;i--){
      while(!stack.isEmpty() && stack.peek()<=nge[i%N]){
        stack.pop();
      }
      if(i<N){
        res[i]=stack.isEmpty()?-1:stack.peek();
      }
      stack.push(nge[i%N]);
    }
    System.out.println(Arrays.toString(res));
  }
}