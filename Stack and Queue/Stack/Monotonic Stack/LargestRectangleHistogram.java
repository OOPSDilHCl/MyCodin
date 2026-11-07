import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class LargestRectangleHistogram{
  public static int[] findPSE(int[] arr){
    Deque<Integer> st=new ArrayDeque<>();
    int n=arr.length;
    int[] pse=new int[n];
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
      pse[i]=st.isEmpty()?-1:st.peek();
      st.push(i);
    }
    return pse;
  }
  public static int[] findNSE(int[] arr){
    Deque<Integer> st=new ArrayDeque<>();
    int n=arr.length;
    int[] nse=new int[n];
    for(int i=n-1;i>=0;i--){
      while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
      nse[i]=st.isEmpty()?n:st.peek();
      st.push(i);
    }
    return nse;
  }
  public static void main(String[] args){
    int[] heights={2,2,5,6,2,3};
    int n=heights.length, maxm=0;
    int[] pse=findPSE(heights);
    System.out.println(Arrays.toString(pse));
    System.out.println(Arrays.toString(heights));
    int[] nse=findNSE(heights);
    System.out.println(Arrays.toString(nse));
    for(int i=0;i<n;i++){
      maxm=Math.max(maxm,(nse[i]-pse[i]-1)*heights[i]);
    }
    System.out.println(maxm);
  }
}