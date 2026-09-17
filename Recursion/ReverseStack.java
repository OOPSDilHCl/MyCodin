import java.util.Stack;
public class ReverseStack{
  public static void insertAtBottom(Stack<Integer> st,int temp){
    if(st.isEmpty()){
      st.push(temp);
      return;
    }
    int val=st.pop();
    insertAtBottom(st,temp);
    st.push(val);
  }
public static void reverseStack(Stack<Integer> st){
    if(!st.isEmpty()){
      int temp=st.pop();
      reverseStack(st);
      insertAtBottom(st,temp);
    }
  }
  public static void main(String[] args){
    Stack<Integer> stk=new Stack<>();
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);
    stk.push(5);
    System.out.println(stk);
    reverseStack(stk);
    System.out.println(stk);
  }
}