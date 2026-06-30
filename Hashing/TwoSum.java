import java.util.*;
public class TwoSum
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n=scan.nextInt();
    System.out.println("Enter elements of the array: ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=scan.nextInt();
    }
System.out.println("Enter target sum: ");
    int target=scan.nextInt();
    HashSet<Integer> hs=new HashSet<>();
    boolean found=false;
    for(int num1 : arr)
    {
      int num2=target-num1;
      if(hs.contains(num2)){//sees for num2 in O(1) time complexity.
        System.out.println("Pair found: "+num1+"+"+num2+" = "+target);
        found=true;
        break;
      }
      hs.add(num1);//O(1) time complexity
    }
    if(!found)
    {
      System.out.println("No pairs found!");
    }
    scan.close();
  }
}