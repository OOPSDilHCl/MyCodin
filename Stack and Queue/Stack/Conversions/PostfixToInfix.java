import java.util.Deque;
import java.util.ArrayDeque;
public class PostfixToInfix{
  public static void main(String[] args){
    String s="abc/-ak/l-*";
    Deque<String> stack=new ArrayDeque<>();
    int n=s.length();
    for(char c : s.toCharArray()){
      if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
        stack.push(c+"");
      }
      else if(c=='^'||c=='*'||c=='/'||c=='%'||c=='+'||c=='-'){
        String op2=stack.pop();
        String op1=stack.pop();
        String str="("+op1+c+op2+")";
        stack.push(str);
      }
    }
    System.out.println(stack.pop());
  }
}