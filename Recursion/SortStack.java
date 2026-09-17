import java.util.Stack;
public class SortStack{
  public static void sortStack(Stack<Integer> st){
    if(!st.isEmpty()){
      int temp=st.pop();
      sortStack(st);
      insert(st,temp);
    }
  }
  public static void insert(Stack<Integer> st,int temp){
    if(st.isEmpty() || st.peek()<=temp){
      st.push(temp);
      return;
    }
    int val=st.pop();
    insert(st,temp);
    st.push(val);
  }
  public static void main(String[] args){
    Stack<Integer> st=new Stack<>();
    st.push(3);
    st.push(5);
    st.push(2);
    st.push(1);
    st.push(4);
    sortStack(st);
    System.out.println(st);
  }
}