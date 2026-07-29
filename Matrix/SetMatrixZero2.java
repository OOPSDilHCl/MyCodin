import java.util.Arrays;
public class SetMatrixZero2{
  public static void main(String[] args){
  int arr[][]={{0,1,8,2},{10,5,0,9},{7,5,4,0}};
  boolean firstColZero=false;
  for(int i=0;i<arr.length;i++){
      if(arr[i][0]==0){
        firstColZero=true;
      }
    for(int j=1;j<arr[0].length;j++){
      if(arr[i][j]==0){
        arr[i][0]=0;
        arr[0][j]=0;
      }
    }
  }
  for(int i=1;i<arr.length;i++){
    for(int j=1;j<arr[0].length;j++){
      if(arr[i][0]==0||arr[0][j]==0){
        arr[i][j]=0;
      }
    }
  }
  if(firstColZero){
    for(int i=0;i<arr.length;i++){
      arr[i][0]=0;
    }
  }
  if(arr[0][0]==0){
    for(int i=0;i<arr[0].length;i++){
      arr[0][i]=0;
    }
  }
  System.out.println(Arrays.deepToString(arr));
  }
}