public class TrappingRainWaterII{
  public static void main(String[] args){
    int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
    int n=height.length;
    int lt=0, ltMax=0, rtMax=0, rt=n-1, total=0;
    while(lt<rt){
      if(height[lt]<=height[rt]){
        if(height[lt]<ltMax){
          total += ltMax-height[lt];
        }else{
          ltMax=height[lt];
        }
        lt++;
      }else{
        if(height[rt]<rtMax){
          total += rtMax-height[rt];
        }else{
          rtMax=height[rt];
        }
        rt--;
      }
    }
    System.out.println(total);
  }
}