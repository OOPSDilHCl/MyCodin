public class BinarySubarraysWithSumK{
  public static int countAtMost(int[] nums, int goal){
    if(goal<0) return 0;
   int lt=0, cnt=0, sum=0, n=nums.length;
    for(int rt=0;rt<n;rt++){
      sum += nums[rt];
      while(sum>goal){
        sum -= nums[lt];
        lt++;
      }
      cnt += rt-lt+1;
    }
    return cnt;
  }
  public static void main(String[] args){
    int nums[]={1,0,1,0,1}, goal=2;
    System.out.println(countAtMost(nums,goal)-countAtMost(nums,goal-1));
  }
}