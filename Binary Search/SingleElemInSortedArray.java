public class SingleElemInSortedArray{
  public static void main(String[] args){
    int arr[]={1,1,2,2,3,3,4,4,5},len=arr.length;
    int lt=0,rt=len-1;
    while(lt<rt){
      int mid=lt+(rt-lt)/2;
      if(mid%2==1) mid--;
      if(arr[mid]==arr[mid+1]){
        lt=mid+2;
      }
      else{
        rt=mid;
      }
    }
    System.out.println(arr[lt]);
  }
}