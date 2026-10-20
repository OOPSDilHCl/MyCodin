public class MaxmPointsCards{
  public static void main(String[] args){
    int arr[]={5,4,1,7,8,1,3}, k=3;
    int lsum=0, rsum=0, len=arr.length, maxSum=0, rt=len-1;
    for(int i=0;i<k;i++){
      lsum += arr[i];
    }
    maxSum = lsum;
    if(k==len){
      System.out.println(maxSum);
      System.exit(0);
    }
    for(int i=k-1;i>=0;i--){
      lsum -= arr[i];
      rsum += arr[rt--];
     maxSum = Math.max(maxSum,lsum+rsum);
    }
    System.out.println(maxSum);
  }
}