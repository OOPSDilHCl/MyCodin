public class JumpGameII{
  public static void main(String[] args){
    int nums[]={3,3,4,1,1,1,1}, len=nums.length, farthest=0, jumps=0, currEnd=0;
    for(int i=0;i<len-1;i++){
      farthest = Math.max(farthest,i+nums[i]);
      if(i==currEnd){
        jumps++;
        currEnd=farthest;
      }
    }
    System.out.println(jumps);
  }
}