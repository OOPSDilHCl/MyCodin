public class CapacityToShipPackagesBS{
  public static boolean possible(int[] arr,int d,int capacity){
    int day=1,load=0;
    for(int x:arr){
      load+=x;
      if(load>capacity){
        day++;
        load=x;
      }
      if(day>d){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    int arr[]={1,2,3,4,5},len=arr.length,d=2;
   int lt=Integer.MIN_VALUE,rt=0,candi=0;
    for(int it:arr){
      lt=Math.max(it,lt);
      rt+=it;
    }
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(possible(arr,d,mid)){
        candi=mid;
        rt=mid-1;
      }else{
        lt=mid+1;
      }
    }
    System.out.println(candi);
  }
}