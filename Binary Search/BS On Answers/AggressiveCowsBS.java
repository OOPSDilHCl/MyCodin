import java.util.Arrays;
public class AggressiveCowsBS{
  public static boolean isPossible(int[] stall,int d,int cows){
    int lastStall=stall[0],count=1,len=stall.length;
    for(int i=1;i<len;i++){
      if(stall[i]-lastStall>=d){
        count++;
        lastStall=stall[i];
      }
      if(count>=cows) return true;
    }
    return false;
  }
  public static void main(String[] args){
    int arr[]={0,3,4,7,10,9},len=arr.length,cows=4;
    Arrays.sort(arr);
    int lt=1,rt=arr[len-1]-arr[0],candi=-1;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(isPossible(arr,mid,cows)){
        candi=mid;
        lt=mid+1;
      }else{
        rt=mid-1;
      }
    }
    System.out.println(candi);
  }
}