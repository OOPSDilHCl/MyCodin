import java.util.Deque;
import java.util.ArrayDeque;
public class LargestRectangleHistogramII{
  public static void main(String[] args){
    int[] heights={2,2,5,6,2,3};
    int n=heights.length, maxm=0;
    Deque<Integer> st=new ArrayDeque<>();
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
        int nse=i;
        int top=heights[st.pop()];
       int pse=st.isEmpty()?-1:st.peek();
        maxm=Math.max(maxm,(nse-pse-1)*top);
      }
      st.push(i);
    }
    while(!st.isEmpty()){
      int nse=n;
      int top=heights[st.pop()];
      int pse=st.isEmpty()?-1:st.peek();
      maxm=Math.max(maxm,(nse-pse-1)*top);
    }
    System.out.println(maxm);
  }
}