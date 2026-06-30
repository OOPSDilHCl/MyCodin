import java.util.*;
public class LCM
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int n=scan.nextInt();
    int m=scan.nextInt();
    int m1=m,n1=n;
    while(m!=0)
    {
      int temp=m;
      m=n%m;
      n=temp;
    }
    int lcm=(n1*m1)/n;
    System.out.println("Least common multiple = "+lcm);
  }
}