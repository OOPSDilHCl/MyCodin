public class KthElementOfSortedArray{
  public static int kthElement(int[] a,int[] b,int k){
    int m=a.length,n=b.length;
    if(m>n) return kthElement(b,a,k);
    int lt=Math.max(0,k-n),rt=Math.min(m,k);
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      int i=k-mid;
      int left1=Integer.MIN_VALUE,left2=Integer.MIN_VALUE,right1=Integer.MAX_VALUE,right2=Integer.MAX_VALUE;
      if(mid>0) left1=a[mid-1];
      if(mid<m) right1=a[mid];
      if(i>0) left2=b[i-1];
      if(i<n) right2=b[i];
      if(left1<=right2 && left2<=right1){
        return Math.max(left1,left2);
      }
      else if(left1>right2){
        rt=mid-1;
      }
      else lt=mid+1;
    }
    return -1;
  }
  public static void main(String[] args){
  int a[]={2,3,6,7,9},b[]={1,4,8,10},k=5;
   System.out.println(kthElement(a,b,k));
  }
}