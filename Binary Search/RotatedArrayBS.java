public class RotatedArrayBS{
  public static void main(String[] args){
    int arr[]={3,3,1,3},len=arr.length;
    int lt=0,rt=len-1;
    while(lt<rt){
      int mid=lt+(rt-lt)/2;
      if(arr[lt]==arr[rt]){
        lt++;
        rt--;
        continue;
      }
      if(arr[mid]>arr[rt]){
        lt=mid+1;
      }
      else{
        rt=mid;
      }
    }
    System.out.println("The array is rotated "+lt+" times.");
  }
}