import java.util.Deque;
import java.util.ArrayDeque;
public class InfixToPrefix{
  public static int precedence(char c){
    if(c=='^') return 3;
    else if(c=='*'||c=='/'||c=='%')
    return 2;
    else if(c=='+'||c=='-') return 1;
    else return 0;
  }
  public static void main(String[] args){
    String s="((a-(b/c))*((a/k)-l))";
    StringBuilder sb=new StringBuilder();
    Deque<Character> stack=new ArrayDeque<>();
    int n=s.length();
    for(int i=n-1;i>=0;i--){
      char c=s.charAt(i);
      if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
        sb.append(c);
      }
      else if(c==')'){
        stack.push(c);
      }
      else if(c=='('){
        while(!stack.isEmpty() && stack.peek()!=')'){
          sb.append(stack.pop());
        }
        stack.pop();
      } else {
        while(!stack.isEmpty() && (precedence(stack.peek())>=precedence(c))){
          sb.append(stack.pop());
        }
        stack.push(c);
      }
    }
    sb.reverse();
    System.out.println(sb.toString());
  }
}