import java.util.*;
public class GCD
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int n=scan.nextInt();
    int m=scan.nextInt();
    while(m!=0)
    {
      int temp=m;
      m=n%m;
      n=temp;
    }
    System.out.println("Greatest common divisor = "+n);
  }
}