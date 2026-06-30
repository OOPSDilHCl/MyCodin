//Descending Order Sorting.
import java.util.*;
public class InsertionSort{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number of elements present: ");
    int n=scan.nextInt();
    System.out.println("Enter the elements : ");
    int arr[]=new int[n];
    int i,j;
    for(i=0;i<n;i++)
     arr[i]=scan.nextInt();
    for(i=1;i<n;i++){
     int temp=arr[i];
      for(j=i-1;j>=0 && arr[j]<temp;j--){
         arr[j+1]=arr[j];
        }
        arr[j+1]=temp;
      }
    System.out.println(Arrays.toString(arr));
  }
}