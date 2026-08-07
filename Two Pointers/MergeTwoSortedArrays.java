import java.util.*;
public class MergeTwoSortedArrays{
  public static void main(String[] args){
    int[] nums1={-5,-2,4,5,0,0,0},nums2={-3,1,8};
    int m=nums1.length,n=nums2.length,i,j;
    /*for(i=m-1;i>0;i--){
      if(nums1[i]!=0){
        break;
      }
    }*///Alternate
    //int index=i;
    int index=m-n-1;
    for(i=m-1,j=n-1;j>=0;){
      if(index<0||nums1[index]<nums2[j]){
        nums1[i--]=nums2[j--];
      }
      else if(nums1[index]>=nums2[j]){
        nums1[i--]=nums1[index--];
      }
    }
    System.out.println(Arrays.toString(nums1));
  }
}