import java.util.Deque;
import java.util.ArrayDeque;
public class MinStack{
  private Deque<Long> stack=new ArrayDeque<>();
  private long min;
  public void push(int x){
    long val=(long)x;
    if(stack.isEmpty()){
      stack.push(val);
      min=val;
    }else{
      if(val>=min){
        stack.push(val);
      }else{
        stack.push(2*val-min);
        min=val;
      }
    }
  }
  public int pop(){
    if(stack.isEmpty()){
      return -1;
    }
    long top=stack.pop();
    if(top<min){
      int value=(int)min;
      min=2*min-top;
      return value;
    }
    return (int)top;
  }
  public int top(){
    if(stack.isEmpty()){
      return -1;
    }
    if(stack.peek()<min){
      return (int)min;
    }else return stack.peek().intValue();
  }
  public int getMin(){
    return (int)min;
  }
  public static void main(String[] args){
    MinStack st=new MinStack();
    st.push(3);
    st.push(10);
    System.out.println(st.getMin());
    System.out.println(st.pop());
    System.out.println(st.pop());
    st.push(10);
    System.out.println(st.getMin());
    st.push(15);
    st.push(19);
    st.push(7);
    st.push(5);
    System.out.println(st.top());
    System.out.println(st.getMin());
    System.out.println(st.pop());
    System.out.println(st.getMin());
    System.out.println(st.pop());
    System.out.println(st.getMin());
  }
}