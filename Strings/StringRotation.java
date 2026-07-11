import java.util.*;
public class StringRotation{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str1=input.nextLine();
    System.out.println("Enter the string: ");
    String str2=input.nextLine();
    if(str1.length()!=str2.length()){
    System.out.println("Not a string rotation.");
    } else {
    String temp=str1+str1;
    if(temp.contains(str2)){
    System.out.println("String rotation.");
    } else System.out.println("Not a string rotation.");
    }
    input.close();
  }
}