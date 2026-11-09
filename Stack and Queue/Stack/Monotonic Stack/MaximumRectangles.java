import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
public class MaximumRectangles{
  public static int maximumRectangleHistogram(int[] arr){
    Deque<Integer> st=new ArrayDeque<>();
    int n=arr.length, total=0;
    for(int i=0;i<n;i++){
      while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
        int nse=i;
        int ele=arr[st.pop()];
       int pse=st.isEmpty()?-1:st.peek();
       total=Math.max(total,(nse-pse-1)*ele);
      }
      st.push(i);
    }
    while(!st.isEmpty()){
      int nse=n;
      int ele=arr[st.pop()];
      int pse=st.isEmpty()?-1:st.peek();
      total=Math.max(total,(nse-pse-1)*ele);
    }
    return total;
  }
  public static void main(String[] args){
    int[][] matrix={
      {1,0,1,0,0},
      {1,0,1,0,1},
      {0,1,1,1,1},
      {1,1,1,1,1}};
    int m=matrix.length, n=matrix[0].length, maxArea=0;
    int[][] prefixSum=new int[m][n];
    for(int c=0;c<n;c++){
      int sum=0;
      for(int r=0;r<m;r++){
        if(matrix[r][c]==0){
          prefixSum[r][c]=sum=0;
        }else{
          sum += matrix[r][c];
          prefixSum[r][c]=sum;
        }
      }
    }
    System.out.println("Histograms row wise: ");
    System.out.println(Arrays.deepToString(prefixSum));
    for(int i=0;i<m;i++){
      maxArea=Math.max(maxArea,maximumRectangleHistogram(prefixSum[i]));
    }
    System.out.println("Maximum rectangular area = "+maxArea);
  }
}