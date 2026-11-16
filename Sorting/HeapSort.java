import java.util.Arrays;
public class HeapSort{
  public static void heapifyDown(int[] heap,int n,int i){
    int largest=i;
    int ltChild=2*i+1, rtChild=2*i+2;
    if(ltChild<n && heap[ltChild]>heap[largest]){
      largest=ltChild;
    }
    if(rtChild<n && heap[rtChild]>heap[largest]){
      largest=rtChild;
    }
    if(largest!=i){
      int temp=heap[largest];
      heap[largest]=heap[i];
      heap[i]=temp;
      heapifyDown(heap,n,largest);
    }
  }
  public static void heapSort(int[] arr,int n){
    for(int i=n/2-1;i>=0;i--){
      heapifyDown(arr,n,i);
    }
    for(int i=n-1;i>=0;i--){
      int temp=arr[0];
      arr[0]=arr[i];
      arr[i]=temp;
      heapifyDown(arr,i,0);
    }
  }
  public static void main(String[] args){
    int[] arr={10,20,30,100,40,15,50,25};
    System.out.println("Original Array:\n"+Arrays.toString(arr));
    heapSort(arr,arr.length);
    System.out.println("Sorted Array:\n"+Arrays.toString(arr));
  }
}