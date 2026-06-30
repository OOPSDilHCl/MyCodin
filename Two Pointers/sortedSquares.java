import java.util.Arrays;
public class sortedSquares{
  public static void main(String args[]){
    int[] arr = {-4, -1, 0, 3, 10};
    int[] res = new int[arr.length];
    int left = 0;
    int right = arr.length - 1;
    int pos = arr.length - 1;
    while (left <= right) {
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        res[pos] = arr[left] * arr[left];
        left++;
      } else {
        res[pos] = arr[right] * arr[right];
        right--;
      }
      pos--;
    }
System.out.println(Arrays.toString(res));
  }
}
   