import java.util.Arrays;
public class NextPermutation{
  public static void main(String[] args){
    int[] arr={4,3,2,1};
    int len=arr.length,i=len-2,ind=len-1;
    while(i>=0 && arr[i]>=arr[i+1]){
      i--;//breakpoint.
    }
    if(i>=0){
      /*start looking from rightmost because its smallest number greater than arr[i].*/
      while(arr[i]>=arr[ind]){
        ind--;
      }
      //swap
      int tmp=arr[i];
      arr[i]=arr[ind];
      arr[ind]=tmp;
    }
    //reverse elements from i+1 to len-1.
      int left=i+1,right=len-1;
      while(left<right){
          int tmp=arr[left];
          arr[left]=arr[right];
          arr[right]=tmp;
          left++;
          right--;
      }
System.out.println(Arrays.toString(arr));
  }
}