import java.util.ArrayDeque;
import java.util.Deque;
public class PostfixToPrefix{
  public static void main(String[] args){
    String s="xyz*+ab/-";
  Deque<String> stack=new ArrayDeque<>();
    for(char c:s.toCharArray()){
      if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
        stack.push(c+"");
      }
      else if(c=='^'||c=='*'||c=='/'||c=='%'||c=='+'||c=='-'){
        String op2=stack.pop();
        String op1=stack.pop();
        String str=c+op1+op2;
        stack.push(str);
      }
    }
    System.out.println(stack.pop());
  }
}