public class SearchInRotatedArrayII{
  public static void main(String[] args){
    int arr[]={3,6,7,7,1,2,3,3},len=arr.length,key=6;
    int lt=0,rt=len-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]==key){
        System.out.println("Element found at index:"+mid);
        return;
      }
      if(arr[lt]==arr[mid] && arr[lt]==arr[rt]){
        lt++;
        rt--;
        continue;
      }
      if(arr[lt]<=arr[mid]){
       if(arr[lt]<=key && arr[mid]>key){
          rt=mid-1;
        }
        else lt=mid+1;
      }
      else{
        if(arr[mid]<key && arr[rt]>=key){
          lt=mid+1;
        }
        else rt=mid-1;
      }
    }
System.out.println("Element not found.");
  }
}