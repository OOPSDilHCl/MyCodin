public class PascalTriangle2{
  public static void main(String[] args){
    int ncr=1,n=5,r=5,c=3;
     if(c>r-c){
      c=r-c;
     }
      for(int j=0;j<c;j++){
        ncr=ncr*(r-j)/(j+1);
      }
      System.out.println(ncr);
    }
}