import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class AsteroidCollision{
  public static void main(String[] args){
   int[] asteroids={-4,5,7,-9,9,-5,3,-3};
    Deque<Integer> st=new ArrayDeque<>();
    for(int a:asteroids){
      if(a>0) st.push(a);
      else{
        while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a)){
          st.pop();
        }
        if(!st.isEmpty() && st.peek()>0 && st.peek()==Math.abs(a)){
          st.pop();
        }
        else if(st.isEmpty() || st.peek()<0){
          st.push(a);
        }
      }
    }
    LinkedList<Integer> res=new LinkedList<>();
    while(!st.isEmpty()){
      res.addFirst(st.pop());
    }
    System.out.println(res.toString());
  }
}