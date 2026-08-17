import java.util.Arrays;
public class KokoEatingBananas{
  public static int hours(int arr[],int mid){
    int len=arr.length,hr=0;
    for(int i=0;i<len;i++){
      hr+=arr[i]/mid;
      if(arr[i]%mid!=0)
        hr+=1;
    }
    return hr;
  }
  public static void main(String[] args){
 int arr[]={25,12,8,14,19},h=5,len=arr.length;
   int candi=0,lt=1,rt=Integer.MIN_VALUE;
    for(int i=0;i<len;i++){
    rt=Math.max(rt,arr[i]);
    }
    while(lt<=rt){
    int mid=lt+(rt-lt)/2;
    if(hours(arr,mid)<=h){
      candi=mid;
      rt=mid-1;
    }
    else lt=mid+1;
    }
    System.out.println(candi);
  }
}