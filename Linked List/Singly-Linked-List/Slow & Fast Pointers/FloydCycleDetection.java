public class FloydCycleDetection{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public boolean hasCycle(){
    Node slow=head,fast=head;
    while(fast!=null && fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
      if(fast==slow){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    FloydCycleDetection list=new FloydCycleDetection();
    list.head=new Node(1);
    list.head.next=new Node(2);
    list.head.next.next=new Node(3);
    list.head.next.next.next=new Node(4);
    //list.head.next.next.next.next=list.head.next;
    if(list.hasCycle()) System.out.println("Cycle detected.");
   else System.out.println("No cycle detected.");
  }
}