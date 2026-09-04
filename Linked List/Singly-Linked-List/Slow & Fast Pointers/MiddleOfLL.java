public class MiddleOfLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public Node findMid(){
    Node fast=head,slow=head;
    while(fast!=null&&fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
    }
    return slow;
  }
  public static void main(String[] args){
    MiddleOfLL list=new MiddleOfLL();
    list.head=new Node(1);
    list.head.next=new Node(2);
    list.head.next.next=new Node(3);
    list.head.next.next.next=new Node(4);
    list.head.next.next.next.next=new Node(5);
  System.out.println(list.findMid().val);
  }
}