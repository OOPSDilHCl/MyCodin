public class RemoveNthNode{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
 public Node deleteNthNodeFromEnd(Node head,int N){
    Node dummy=new Node(0);
    dummy.next=head;
    Node slow=dummy,fast=dummy;
    int n=N;
    while(n-->0){
      fast=fast.next;
      if(fast==null){
        throw new IllegalArgumentException("N is greater than list length!");
      }
    }
    while(fast.next!=null){
      fast=fast.next;
      slow=slow.next;
    }
    slow.next=slow.next.next;
    return dummy.next;
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
    RemoveNthNode ll=new RemoveNthNode();
    ll.head=new Node(1);
    ll.head.next=new Node(2);
    ll.head.next.next=new Node(3);
    ll.head.next.next.next=new Node(4);
    ll.head.next.next.next.next=new Node(5);
    ll.deleteNthNodeFromEnd(ll.head,3);
    ll.printList(ll.head);
  }
}