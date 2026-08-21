public class BookAllocationBS{
  public static void main(String[] args){
    int arr[]={12,34,67,90},m=2,n=arr.length,candi=0;
    if(m>n){
      System.out.println("Not possible");
      return;
    }
    int lt=0,rt=0;
    for(int num:arr){
      lt=Math.max(lt,num);
      rt+=num;
    }
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(canAssign(arr,mid,m)){
        candi=mid;
        rt=mid-1;
      }else{
        lt=mid+1;
      }
    }
    System.out.println(candi);
  }
  public static boolean canAssign(int[] arr,int maxPages,int m){
    int students=1,pages=0;
    for(int num:arr){
      pages+=num;
      if(pages>maxPages){
        pages=num;
        students++;
      }
    }
    return students<=m;
  }
}