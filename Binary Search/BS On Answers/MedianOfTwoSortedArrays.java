public class MedianOfTwoSortedArrays{
  public static double findMedianSortedArrays(int[] nums1,int[] nums2){
    int m=nums1.length,n=nums2.length;
    if(m>n) return findMedianSortedArrays(nums2,nums1);
    int lt=0,rt=m,half=(m+n+1)/2;
    while(lt<=rt){
      int i=lt+(rt-lt)/2;
      int j=half-i;
  int left1=Integer.MIN_VALUE,left2=Integer.MIN_VALUE,right1=Integer.MAX_VALUE,right2=Integer.MAX_VALUE;
      if(i>0) left1=nums1[i-1];
      if(j>0) left2=nums2[j-1];
      if(i<m) right1=nums1[i];
      if(j<n) right2=nums2[j];
      if(left1<=right2 && left2<=right1){
        if((m+n)%2==1) return Math.max(left1,left2);
        return (double)(Math.max(left1,left2)+Math.min(right1,right2))/2.0;
      }
      else if(left1>right2) rt=i-1;
      else lt=i+1;
    }
    return 0;
  }
  public static void main(String[] args){
    int[] nums1={1,3},nums2={2,4};
    int m=nums1.length,n=nums2.length;
    System.out.println(findMedianSortedArrays(nums1,nums2));
  }
}