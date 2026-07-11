import java.util.*;
public class StringCompression{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str=input.nextLine();
    String t="";
    int l=str.length(),c=1;
    for(int i=0;i<l-1;i++){
      if(str.charAt(i)!=str.charAt(i+1)){
        t+=str.charAt(i)+""+c;
        c=1;
      } else c++;
    }
    t+=str.charAt(l-1)+""+c;
    if(str.length()>t.length())
    System.out.println(t);
    else System.out.println(str);
    input.close();
  }
}