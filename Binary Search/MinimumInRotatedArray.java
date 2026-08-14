public class MinimumInRotatedArray{
  public static void main(String[] args){
    int arr[]={4,4,4,5,1,2,4},len=arr.length;
    int lt=0,rt=len-1;
    while(lt<=rt){
      if(arr[lt]<arr[rt]){
        System.out.println(arr[lt]);
        return;
      }
      int mid=lt+(rt-lt)/2;
      if(arr[mid]>arr[rt]){
        lt=mid+1;
      }
      else if(arr[mid]<arr[rt]){
        rt=mid;
      }
      else rt--;
    }
    System.out.println(arr[lt]);
  }
}