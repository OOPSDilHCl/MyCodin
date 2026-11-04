import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class NextSmallerElement{
  public static void main(String[] args){
    int[] arr={6,8,2,1,5,4};
    int n=arr.length;
    int[] nse=new int[n];
    Deque<Integer> st=new ArrayDeque<>();
    for(int i=n-1;i>=0;i--){
      while(!st.isEmpty() && st.peek()>=arr[i]){
        st.pop();
      }
      nse[i]=st.isEmpty()?-1:st.peek();
      st.push(arr[i]);
    }
    System.out.println(Arrays.toString(nse));
  }
}