import java.util.Deque;
import java.util.ArrayDeque;
public class RemoveKDigits{
  public static void main(String[] args){
    String nums="1002291";
    int k=3;
    Deque<Character> st=new ArrayDeque<>();
    for(char n:nums.toCharArray()){
      while(!st.isEmpty() && k>0 && (st.peek()-'0')>(n-'0')){
        st.pop();
        k--;
      }
      st.push(n);
    }
    while(!st.isEmpty() && k>0){
      st.pop();
      k--;
    }
    if(st.isEmpty()){
      System.out.println("0");
      System.exit(0);
    }
    StringBuilder sb=new StringBuilder();
    while(!st.isEmpty()){
      sb.append(st.pop());
    }
    while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
      sb.deleteCharAt(sb.length()-1);
    }
    sb.reverse();
    System.out.println(sb);
  }
}