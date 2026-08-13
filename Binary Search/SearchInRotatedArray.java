public class SearchInRotatedArray{
  public static void main(String[] args){
    int arr[]={4,6,1,2,3},len=arr.length,key=6;
    int lt=0,rt=len-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]==key){
        System.out.println("Search successful: "+mid);
        return;
      }
      if(arr[lt]<=arr[mid]){
       if(key>=arr[lt] && key<=arr[mid]){
          rt=mid-1;
        }
        else lt=mid+1;
      }
      else{
       if(key>=arr[mid] && key<=arr[rt]){
          lt=mid+1;
        }
        else rt=mid-1;
      }
    }
    System.out.println("Search was unsuccessful element not found:");
  }
}