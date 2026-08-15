public class PeakElement{
  public static void main(String[] args){
    int arr[]={1,2,1,3,5,6,4},len=arr.length;
    int lt=0,rt=len-1;
    while(lt<rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]>arr[mid+1]){
        rt=mid;
      }
      else{
        lt=mid+1;
      }
    }
    System.out.println(arr[lt]);
  }
}