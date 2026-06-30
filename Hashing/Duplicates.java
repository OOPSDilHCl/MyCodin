import java.util.*;
public class Duplicates
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements in array:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    Set<Integer> set=new HashSet<>();
    boolean flag=false;
    for(int num : arr)
    {
      if(!set.add(num))
      {
        System.out.print(num+" ");
        flag=true;
      }
    }
    if(flag==false)
    System.out.println("No duplicates found!");
    sc.close();
  }
}