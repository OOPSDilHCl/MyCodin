import java.util.Arrays;
public class SubarraysEqualtok{
  //For positive elements.
  public static void main(String[] args){
    int[] arr={3,1,2,4};
    int len=arr.length,left=0,right=0,c=0,k=6,sum=0;
    while(right<=len-1){
      sum+=arr[right++];
      while(sum>k){
        sum-=arr[left];
        left++;
      }
      if(sum==k){
        sum-=arr[left];
        left++;
        c++;
      }
    }
    System.out.println(c);
  }
}