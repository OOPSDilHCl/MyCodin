public class SegregationLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
 public Node segregateEvenOdd(Node head){
    if(head==null || head.next==null){
      return head;
    }
    Node odd=head,even=head.next,evenHead=even;
    while(even!=null&&even.next!=null){
      odd.next=even.next;
      odd=odd.next;
      even.next=odd.next;
      even=even.next;
    }
    odd.next=evenHead;
    return head;
  }
  public void printList(Node head){
    if(head==null){
    System.out.println("List is empty!");
    return;
    }
    Node curr=head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public static void main(String[] args){
    SegregationLL ll=new SegregationLL();
    ll.head=new Node(1);
    ll.head.next=new Node(2);
    ll.head.next.next=new Node(3);
    ll.head.next.next.next=new Node(4);
    ll.head.next.next.next.next=new Node(5);
    ll.head.next.next.next.next.next=new Node(6);
    ll.segregateEvenOdd(ll.head);
    ll.printList(ll.head);
  }
}