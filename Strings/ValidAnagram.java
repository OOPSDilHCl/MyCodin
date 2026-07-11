import java.util.*;
public class ValidAnagram
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str1=in.nextLine();
    System.out.println("Enter the second string: ");
    String str2=in.nextLine();
    int[] count=new int[26];
    int l=str1.length();
    for(int i=0;i<l;i++){
      count[str1.charAt(i)-'a']++;
      count[str2.charAt(i)-'a']--;
    }
    for(int c : count){
      if(c!=0){
        System.out.println("Not a valid anagram.");
        in.close();
        return;
      }
    }
    System.out.println("Valid anagram.");
    in.close();
  }
}