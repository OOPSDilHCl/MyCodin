public class SearchInsertBS{
  public static void main(String[] args){
    int[] a={2,5,7,8,9,10,16,19};
 int len=a.length,x=18,lt=0,rt=len-1,ans=0;
    int mid=lt+(rt-lt)/2;
    while(lt<=rt){
      mid=lt+(rt-lt)/2;
      if(a[mid]>=x){
        if(a[mid]==x){
          System.out.println(mid);
          return;
        }
        ans=mid;
        rt=mid-1;
      }
      else lt=mid+1;
    }
    System.out.println(ans);
  }
}