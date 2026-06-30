import java.util.*;
public class buySellStock
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of array.");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the stock price each day: ");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int maxProfit=0;
    int minPrice=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
      if(arr[i]<minPrice)
      minPrice=arr[i];
      else if(arr[i]-minPrice>maxProfit)
      maxProfit=arr[i]-minPrice;
    }
    System.out.println(maxProfit);
  }
}