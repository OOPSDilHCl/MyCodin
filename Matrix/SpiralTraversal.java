public class SpiralTraversal{
  public static void main(String[] args){
    int[][] arr={{1,2,3},{8,9,4},{7,6,5}};
  int rows=arr.length,cols=arr[0].length,top=0,left=0,bottom=rows-1,right=cols-1;
    while(top<=bottom && left<=right){
      for(int i=left;i<=right;i++){
       System.out.print(arr[top][i]+" ");
      }
      top++;
      for(int i=top;i<=bottom;i++){
    System.out.print(arr[i][right]+" ");
      }
      right--;
      if(top<=bottom)
      for(int i=right;i>=left;i--){
    System.out.print(arr[bottom][i]+" ");
      }
      bottom--;
      if(left<=right)
      for(int i=bottom;i>=top;i--){
    System.out.print(arr[i][left]+" ");
      }
      left++;
    }
  }
}