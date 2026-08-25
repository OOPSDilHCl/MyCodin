public class SearchInRowAndColSortedArray{
  public static void main(String[] args){
    int[][] mat={
      {1,4,7,11},
      {2,5,8,12},
      {3,6,9,16},
      {10,13,14,17}
    };
    int n=mat.length,m=mat[0].length,target=17;
    int i=0,j=m-1;
    while(i<n && j>=0){
      if(mat[i][j]==target){
        System.out.println("Found at: ("+i+","+j+")");
        return;
      }
      else if(mat[i][j]<target){
        i++;
      }else j--;
    }
    System.out.println("Not Found");
  }
}