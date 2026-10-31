import java.util.Deque;
import java.util.ArrayDeque;
public class InfixToPostfix{
  public static int precedence(char c){
    if(c=='^') return 3;
    else if(c=='*'||c=='%'||c=='/') return 2;
    else if(c=='+'||c=='-') return 1;
    else return 0;
  }
  public static void main(String[] args){
    Deque<Character> stack=new ArrayDeque<>();
    String s="a+b*c^d-e^f*g+h";
    StringBuilder sb=new StringBuilder();
    for(char c:s.toCharArray()){
      if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
        sb.append(c);
      }
      else if(c=='('){
        stack.push(c);
      }
      else if(c==')'){
        while(!stack.isEmpty() && stack.peek()!='('){
          sb.append(stack.pop());
        }
        stack.pop();
      } else {
        while(!stack.isEmpty() && precedence(c)<=precedence(stack.peek())){
          sb.append(stack.pop());
        }
        stack.push(c);
      }
    }
    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }
    System.out.println(sb.toString());
  }
}