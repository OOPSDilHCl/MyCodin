import java.util.*;
public class MoveZeroes
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0)
      {
        arr[j]=arr[i];
        if(i!=j)
        arr[i]=0;
        j++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}