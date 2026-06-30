import java.util.Scanner;
public class Strong
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=input.nextInt(),sum=0,fact=1,num=n;
    do
    {
    fact=1;
    for(int i=n%10;i>0;i--)
     {
      fact*=i;
     }
    sum+=fact;
    n/=10;
    }while(n>0);
    if(num==sum)
    System.out.println(num+" is a Strong Number.");
    else 
    System.out.println(num+" is not a Strong Number.");
  }
}