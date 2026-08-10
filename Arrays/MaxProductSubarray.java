import java.util.*;
public class MaxProductSubarray{
  public static void main(String[] args){
    int arr[]={-3,-2,1,0,-4,-5},len=arr.length,suff=1,pref=1;
    int ans=Integer.MIN_VALUE;
    for(int i=0;i<len;i++){
      if(pref==0) pref=1;
      if(suff==0) suff=1;
      pref*=arr[i];
      suff*=arr[len-i-1];
      ans=Math.max(ans,Math.max(pref,suff));
    }
    System.out.println(ans);
  }
}