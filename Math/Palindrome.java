import java.util.*;
public class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
 System.out.println("Enter a number: ");
    int r=0,n=scan.nextInt();
    int num=n;
    while(n>0)
    {
      r=r*10+n%10;
      n/=10;
    }
System.out.println("Reverse of "+num+" = "+r);
    if(r==num)
     System.out.println("It is a palindrome number.");
     else System.out.println("It is not a palindrome number.");
  }
}