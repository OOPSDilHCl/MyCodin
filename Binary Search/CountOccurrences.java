public class CountOccurrences{
  public static void main(String[] args){
    int arr[]={1,1,2,2,2,2,2,3,3,3},len=arr.length,key=2;
  int lt=0,rt=len-1,firstIn=-1,lastIn=-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]==key){
        firstIn=mid;
        rt=mid-1;
      }
      else if(arr[mid]<key){
        lt=mid+1;
      }
      else rt=mid-1;
    }
    lt=0; rt=len-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]==key){
        lastIn=mid;
        lt=mid+1;
      }
      else if(arr[mid]<key){
        lt=mid+1;
      }
      else rt=mid-1;
    }
    if(firstIn!=-1)
    System.out.println(lastIn-firstIn+1);
  } 
}