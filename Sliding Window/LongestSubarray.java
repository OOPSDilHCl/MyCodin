import java.util.Arrays;
//Only non-negative numbers.
public class LongestSubarray{
  public static void main(String[] args){
    int[] arr={6,5,2,2,1,3,5,1,2,1,0,1};
    int len=arr.length,sum=0,left=0,right=0,k=5,longest=0;
    while(right<len){
      sum+=arr[right];
      while(left<=right && sum>k){
        sum-=arr[left++];
      }
      if(sum==k){
        longest=Math.max(longest,right-left+1);
      }
      right++;
    }
    System.out.println(longest);
  }
}