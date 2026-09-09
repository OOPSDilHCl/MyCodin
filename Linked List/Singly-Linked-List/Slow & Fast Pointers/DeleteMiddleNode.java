public class DeleteMiddleNode{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public static void main(String[] args){
    DeleteMiddleNode ll=new DeleteMiddleNode();
    ll.head=new Node(1);
    ll.head.next=new Node(2);
    ll.head.next.next=new Node(3);
    ll.head.next.next.next=new Node(4);
 ll.head.next.next.next.next=new Node(5);
    ll.head.next.next.next.next.next=new Node(6);
    Node slow=ll.head,fast=ll.head.next.next;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    slow.next=slow.next.next;
    StringBuilder sb=new StringBuilder();
    Node curr=ll.head;
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
}