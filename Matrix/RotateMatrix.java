import java.util.Arrays;
public class RotateMatrix{
  public static void main(String[] args){
  int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int m=arr.length,n=arr[0].length,top=0,bottom=m-1;
    //Reverse the rows.
    while(top<bottom){
      for(int j=0;j<n;j++){
        int temp=arr[top][j];
        arr[top][j]=arr[bottom][j];
        arr[bottom][j]=temp;
      }
        top++;
        bottom--;
    }
    //Transpose for n×n.
    for(int i=0;i<m;i++){
      for(int j=i+1;j<n;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }
    System.out.println(Arrays.deepToString(arr));
  }
}