import java.util.*;
public class LongestWord{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str=input.nextLine();
    int l=str.length();
    String longest="";
    String current="";
    for(int i=0;i<=l;i++){
      if(l==i||str.charAt(i)==' '){
        if(longest.length()<current.length()) longest=current;
        current="";
      }
      else current+=str.charAt(i);
    }
    System.out.println(longest);
    input.close();
  }
}