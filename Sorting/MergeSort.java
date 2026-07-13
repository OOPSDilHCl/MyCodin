import java.util.*;
public class MergeSort{
  public static void mergeSort(int[] arr, int left, int right){
    if(left>=right)
    return;
    int mid=left+(right-left)/2;
    mergeSort(arr,left,mid);
    mergeSort(arr,mid+1,right);
    merge(arr,left,mid,right);
  }
  public static void merge(int[] arr,int left, int mid, int right){
    int m=mid-left+1;
    int n=right-mid;
    int leftArr[]=new int[m];
    int rightArr[]=new int[n];
    for(int i=0;i<m;i++){
      leftArr[i]=arr[left+i];
    }
    for(int i=0;i<n;i++){
      rightArr[i]=arr[mid+1+i];
    }
    int i=0,j=0,k=left;
    while(i<m && j<n){
      if(leftArr[i]<=rightArr[j]){
        arr[k++]=leftArr[i++];
      }
      else arr[k++]=rightArr[j++];
    }
    while(i<m){
        arr[k++]=leftArr[i++];
    }
    while(j<n){
      arr[k++]=rightArr[j++];
    }
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n=input.nextInt();
    System.out.println("Enter the integer elements: ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=input.nextInt();
    }
    System.out.println("Before Sorting→ ↓");
    System.out.println(Arrays.toString(arr));
    mergeSort(arr,0,n-1);
    System.out.println("After Sorting→ ↓");
    System.out.println(Arrays.toString(arr));
    input.close();
  }
}