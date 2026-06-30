//DutchNationalFlag ThreePointers
import java.util.*;
public class sort012 {
  public static void main(String[] args){
    int arr[] = {0,2,1,0,1,2};
    int start=0, mid=0, end=arr.length-1;
    while (mid <= end) {
      if (arr[mid] == 0) {
        int temp = arr[start];
        arr[start] = arr[mid];
        arr[mid] = temp;
        start++;
        mid++;
      }
      else if (arr[mid] == 1) {
        mid++;
      }
      else { 
        int temp = arr[mid];
        arr[mid] = arr[end];
        arr[end] = temp;
        end--;//no mid++ bcz mid gets a value swapped from end which we dont know.
      }
    }
System.out.println(Arrays.toString(arr));
  }
}