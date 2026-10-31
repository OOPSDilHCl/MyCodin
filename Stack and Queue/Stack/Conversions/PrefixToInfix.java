import java.util.Deque;
import java.util.ArrayDeque;
public class PrefixToInfix{
  public static void main(String[] args){
    String s="*+ab-cd";
    Deque<String> stack=new ArrayDeque<>();
    int n=s.length();
    for(int i=n-1;i>=0;i--){
      char c=s.charAt(i);
      if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
        stack.push(c+"");
      }
      else{
        String str="("+stack.pop()+c+stack.pop()+")";
        stack.push(str);
      }
    }
    System.out.println(stack.pop());
  }
}