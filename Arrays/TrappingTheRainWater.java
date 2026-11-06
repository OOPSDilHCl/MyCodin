public class TrappingTheRainWater{
  public static void main(String[] args){
    int height[]={0,1,0,2,1,0,1,3,2,1,2,1}, n=height.length;
    int suffix[]=new int[n];
    suffix[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
      suffix[i]=Math.max(height[i],suffix[i+1]);
    }
    int leftMax=0, total=0;
    for(int i=0;i<n;i++){
     leftMax=Math.max(leftMax,height[i]);
     total += Math.min(leftMax,suffix[i]) -height[i];
    }
    System.out.println(total);
  }
}