public class SplitArrayLargestSumBS{
  public static boolean subArr(int arr[],int mid,int k){
    int grp=1,cnt=0;
    for(int i:arr){
      cnt+=i;
      if(cnt>mid){
        grp++;
        cnt=i;
      }
    }
    return grp<=k;
  }
  public static void main(String[] args){
    int arr[]={7,2,5,10,8},len=arr.length,k=2;
    int lt=0,rt=0;
    for(int i:arr){
      lt=Math.max(lt,i);
      rt+=i;
    }
    while(lt<rt){
      int mid=lt+(rt-lt)/2;
      if(subArr(arr,mid,k)){
        rt=mid;
      }
      else{
        lt=mid+1;
      }
    }
    System.out.println(lt);
  }
}