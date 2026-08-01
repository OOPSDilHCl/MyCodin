public class PascalTriangle{
  public static void main(String[] args){
    int ncr=1,n=5;
    for(int i=0;i<n;i++){
      ncr=1;
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
        System.out.print(ncr+" ");
        ncr=ncr*(i-j)/(j+1);
      }
      System.out.println();
    }
  }
}