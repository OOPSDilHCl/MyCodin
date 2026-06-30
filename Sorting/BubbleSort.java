import java.util.*;
public class BubbleSort{
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
      boolean flag=false;
      for(int j=0;j<n-i-1;j++){
        c++;//just to check how small iterations became.
        if(arr[j]>arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
          flag=true;
        }
      }
      if(!flag) break;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(c);
  }
}