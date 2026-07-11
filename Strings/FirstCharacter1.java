import java.util.*;//First repeated char.
public class FirstCharacter1
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str=in.nextLine();
    HashSet<Character> set=new HashSet<>();
    int l=str.length();
    for(int i=0;i<l;i++){
      if(set.contains(str.charAt(i))){
       System.out.println("First Repeated character → "+str.charAt(i));
       in.close();
       return;
      }
      set.add(str.charAt(i));
    }
     System.out.println("No repeated character.");
    in.close();
  }
}