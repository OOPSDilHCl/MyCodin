public class MaxConsecutiveOnesIII{
  public static void main(String[] args){
    int arr[]={0,0,0,1,1,0,0,1,1,1,0,0,1,1,1}, n=arr.length, k=3, maxLen=0;
    int lt=0, rt=0, len=0, zeros=0;
    while(rt<n){
      if(arr[rt]==0) zeros++;
      if(zeros>k){
        if(arr[lt]==0) zeros--;
        lt++;
      }
      rt++;
      maxLen=Math.max(maxLen,rt-lt+1);
    }
    System.out.println(maxLen);
  }
}