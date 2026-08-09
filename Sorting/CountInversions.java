import java.util.Arrays;
public class CountInversions{
  public static int mergeSort(int[] arr,int low,int high){
    int cnt=0;
    if(low>=high) return cnt;
    int mid=low+(high-low)/2;
    cnt+=mergeSort(arr,low,mid);
    cnt+=mergeSort(arr,mid+1,high);
    cnt+=merge(arr,low,mid,high);
    return cnt;
  }
  public static void main(String[] args){
    int arr[]={5,4,3,2,1},len=arr.length;
    System.out.println(mergeSort(arr,0,len-1));
  }
  public static int merge(int[] arr,int low,int mid,int high){
    int m=mid-low+1,n=high-mid,cnt=0;
    int[] leftArr=new int[m];
    int[] rightArr=new int[n];
    for(int i=0;i<m;i++)
      leftArr[i]=arr[low+i];
    for(int i=0;i<n;i++)
      rightArr[i]=arr[mid+1+i];
    int i=0,j=0,k=low;
    while(i<m && j<n){
      if(leftArr[i]<=rightArr[j])
        arr[k++]=leftArr[i++];
      else{
        arr[k++]=rightArr[j++];
        cnt+=m-i;
      }
    }
    while(i<m) arr[k++]=leftArr[i++];
    while(j<n) arr[k++]=rightArr[j++];
    return cnt;
  }
}