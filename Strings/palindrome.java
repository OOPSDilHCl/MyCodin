import java.util.*;
public class palindrome{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
  System.out.println("Enter a string: ");
    String str=input.nextLine();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch=Character.toLowerCase(str.charAt(i));
      if((ch>='a' && ch<='z')){
        sb.append(ch);
      }
    }
    int l=sb.length();
    for(int i=0;i<l/2;i++){
      if(sb.charAt(i)!=sb.charAt(l-i-1)){
       System.out.println("Not a palindrome!");
       input.close();
       return;
      }
    }
    System.out.println("Valid Palindrome String.");
    input.close();
  }
}