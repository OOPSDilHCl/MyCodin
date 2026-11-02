import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class NextGreaterElement{
  public static void main(String[] args){
    int[] nge={6,8,0,1,3};
    int len=nge.length;
    Deque<Integer> stack=new ArrayDeque<>();
    int[] res=new int[len];
    for(int i=len-1;i>=0;i--){
      while(!stack.isEmpty() && stack.peek()<=nge[i]){
        stack.pop();
      }
      if(stack.isEmpty()) res[i]=-1;
      else res[i]=stack.peek();
      stack.push(nge[i]);
    }
    System.out.println(Arrays.toString(res));
  }
}