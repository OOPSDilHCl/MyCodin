public class Maximum1s2DArrayOpt{
  public static void main(String[] args){
    int mat[][]={{0,1,1},{0,0,1},{0,0,0},{0,1,1},{1,1,1}}, m=mat.length,n=mat[0].length;
    int i=0,j=n-1,row=-1;
    while(i<m && j>=0){
      if(mat[i][j]==1){
        row=i;
        j--;
      }else i++;
    }
    System.out.println(row);
  }
}