import java.util.*;
public class UnionSet
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number of elements in first array: ");
    int n=scan.nextInt();
    System.out.println("Enter elements of the array: ");
    int[] arr1=new int[n];
    for(int i=0;i<n;i++)
      arr1[i]=scan.nextInt();
    System.out.println("Enter number of elements in second array: ");
    int m=scan.nextInt();
    System.out.println("Enter elements of the array: ");
    int[] arr2=new int[m];
    for(int i=0;i<m;i++)
      arr2[i]=scan.nextInt();
HashSet<Integer> unionSet=new HashSet<>();
    for(int num : arr1)
    {
      unionSet.add(num);
    }
    for(int num : arr2)
    {
      unionSet.add(num);
    }
    System.out.println(unionSet);
    scan.close();
  }
}