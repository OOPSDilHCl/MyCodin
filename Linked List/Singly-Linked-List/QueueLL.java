public class QueueLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  private Node tail;
  public void enque(int val){
    Node newNode=new Node(val);
    if(isEmpty()){
      head=newNode;
      tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
  }
  public int deque(){
    if(isEmpty()){
      throw new java.util.NoSuchElementException("Cannot deque from an empty queue.");
    }
    int val=head.val;
    head=head.next;
    if(head==null){
      tail=null;
    }
    return val;
  }
  public int peek(){
    if(isEmpty()){
      throw new java.util.NoSuchElementException("Queue is empty!");
    }
    return head.val;
  }
  public boolean isEmpty(){
    return head==null;
  }
  public static void main(String[] args){
    QueueLL ll=new QueueLL();
    ll.enque(1);
    ll.enque(3);
    ll.enque(3);
    ll.enque(2);
    ll.enque(2);
    ll.enque(1);
    ll.enque(1);
    ll.deque();
    ll.deque();
    ll.deque();
    ll.deque();
    System.out.println(ll.deque());
    if(ll.isEmpty()){
      System.out.println("Empty queue.");
    }else{
  System.out.println("Not empty queue.");
    }
    System.out.println(ll.peek());
    ll.deque();
    System.out.println(ll.deque());
    if(ll.isEmpty()){
      System.out.println("Empty queue.");
    }else{
  System.out.println("Not empty queue.");
    }
  }
}