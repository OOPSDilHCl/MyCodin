public class KthMissingElement{
  public static void main(String[] args){
    int arr[]={1,4,5,7,11},len=arr.length,k=5;
    int lt=0,rt=len-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      int missing=arr[mid]-(mid+1);
      if(missing<k){
        lt=mid+1;
      }else{
        rt=mid-1;
      }
    }
    int ans=lt+k;//rt+1+k;
    System.out.println(ans);
  }
}