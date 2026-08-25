public class FindPeak2DElement{
 public static int maxElement(int[] arr){
  int m=arr.length,max=Integer.MIN_VALUE,index=-1;
    for(int i=0;i<m;i++){
      if(arr[i]>max){
        max=arr[i];
        index=i;
      }
    }
    return index;
  }
  public static void main(String[] args){
    int mat[][]={{5,1,8},{4,2,9},{3,9,10}},n=mat.length,m=mat[0].length;
    int lt=0,rt=n-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      int col=maxElement(mat[mid]);
      int up=(mid-1)>=0?mat[mid-1][col]:Integer.MIN_VALUE;
      int down=(mid+1)<=n-1?mat[mid+1][col]:Integer.MIN_VALUE;
if(mat[mid][col]>up&&down<mat[mid][col]){
        System.out.println("("+mid+","+col+")");
        return;
      }
  else if(mat[mid][col]<down){
        lt=mid+1;
      }else rt=mid-1;
    }
  } 
}