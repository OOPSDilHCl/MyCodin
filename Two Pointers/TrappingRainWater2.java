import java.util.*;
public class TrappingRainWater2{
  public static void main(String[] args){
  int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
    int len=height.length,lt=0,rt=len-1,ltMax=0,rtMax=0,trapdWater=0;
    while(lt<=rt){
      if(ltMax<=rtMax){
        if(height[lt]>=ltMax)
          ltMax=height[lt];
       else trapdWater+=ltMax-height[lt];
       lt++;
      }
      else{
        if(height[rt]>=rtMax)
          rtMax=height[rt];
       else trapdWater+=rtMax-height[rt];
        rt--;
      }
    }
    System.out.println(trapdWater);
  }
}