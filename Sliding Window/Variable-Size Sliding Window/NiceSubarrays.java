public class NiceSubarrays{
  public static int atMost(int[] nums, int n,int k){
    int lt=0, total=0, cnt=0;
    for(int rt=0; rt<n; rt++){
      cnt += nums[rt]&1;
      while(cnt>k){
        cnt -= nums[lt]&1;
        lt++;
      }
      total += rt-lt+1;
    }
    return total;
  }
  public static void main(String[] args){
    int nums[]={1,3,3,4,5,2,1}, n=nums.length, k=3;
    int total=atMost(nums,n,k)-atMost(nums,n,k-1);
    System.out.println(total);
  }
}