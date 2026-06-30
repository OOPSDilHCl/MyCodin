import java.util.*;
public class SelectionSort{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number of elements present: ");
    int n=scan.nextInt();
    System.out.println("Enter the elements : ");
    int arr[]=new int[n];
    int c=0;
    for(int i=0;i<n;i++)
     arr[i]=scan.nextInt();
    for(int i=0;i<n-1;i++){
      int min=arr[i],key=i;
      for(int j=i+1;j<n;j++){
        c++;//just to check how small iterations became.
        if(arr[j]<min){
          min=arr[j];
          key=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[key];
      arr[key]=temp;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(c);
  }
}