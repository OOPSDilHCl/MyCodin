import java.util.Deque;
import java.util.ArrayDeque;
public class PrefixToPostfix{
  public static void main(String[] args){
    String s="*+ab-cd";
    Deque<String> stack=new ArrayDeque<>();
    int n=s.length();
    for(int i=n-1;i>=0;i--){
      char c=s.charAt(i);
      if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
        stack.push(c+"");
      }
      else if(c=='^'||c=='*'||c=='/'||c=='%'||c=='+'||c=='-'){
        String str=""+stack.pop()+stack.pop()+c;
        stack.push(str);
      }
    }
    System.out.println(stack.pop());
  }
}