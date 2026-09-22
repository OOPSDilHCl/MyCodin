public class CountSubsequences{
  public static int subsequencesWithSumK(int[] arr,int k){
    return helper(0,0,k,arr);
  }
  private static int helper(int index,int sum,int target,int arr[]){
    if(index==arr.length) 
      return (sum==target)?1:0;
    return helper(index+1,sum+arr[index],target,arr) + helper(index+1,sum,target,arr);
  }
  public static void main(String[] args){
    int arr[]={4,9,2,5,1,5},k=10;
    int count=subsequencesWithSumK(arr,k);
    System.out.println(count);
  }
}