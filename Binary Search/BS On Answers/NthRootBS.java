public class NthRootBS{
  public static void main(String[] args){
    int n=4,m=14641,lt=1,rt=m,mid=0;
    while(lt<=rt){
      mid=lt+(rt-lt)/2;
      if(Math.pow(mid,n)==m){
        System.out.println(mid);
        return;
      }
      else{
        if(Math.pow(mid,n)<m){
          lt=mid+1;
        }
        else{
          rt=mid-1;
        }
      }
    }
    System.out.println(-1);
  }
}
