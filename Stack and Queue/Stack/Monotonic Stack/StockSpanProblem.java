import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
public class StockSpanProblem{
  public static void main(String[] args){
    Deque<Integer> st=new ArrayDeque<>();
    int stocks[]={7,2,1,4,4,8,3,5},n=stocks.length;
    int[] res=new int[n];
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && stocks[i]>=stocks[st.peek()]){
        st.pop();
      }
      res[i]=st.isEmpty()?(i+1):(i-st.peek());
      st.push(i);
    }
    System.out.println(Arrays.toString(res));
  }
}