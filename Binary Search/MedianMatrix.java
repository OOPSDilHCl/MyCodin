public class MedianMatrix{
  public static int count(int[][] arr,int med){
    int count=0,m=arr.length;
    for(int i=0;i<m;i++){
      count+=upperbound(arr[i],med);
    }
    return count;
  }
  public static int upperbound(int[] arr,int med){
    int lt=0,rt=arr.length-1,ans=arr.length;
    while(lt<=rt){
      int mid=lt+(rt-lt)/2;
      if(arr[mid]>med){
        ans=mid;
        rt=mid-1;
      }else lt=mid+1;
    }
    return ans;
  }
  public static void main(String[] args){
    int arr[][]={{2,3,5},{7,8,9},{1,4,6}},m=arr.length,n=arr[0].length;
    int lt=Integer.MAX_VALUE,rt=Integer.MIN_VALUE;
    for(int i=0;i<m;i++){
      lt=Math.min(lt,arr[i][0]);
      rt=Math.max(rt,arr[i][n-1]);
    }
    while(lt<=rt){
      int t=m*n/2+1;
      int mid=lt+(rt-lt)/2;
      if(count(arr,mid)>=t){
        rt=mid-1;
      }else lt=mid+1;
    }
    System.out.println(lt);
  }
}