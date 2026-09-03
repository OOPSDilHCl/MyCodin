public class ReverseDLL{
  private static class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  private Node tail;
  public void addFirst(int val){
    Node newNode=new Node(val);
    if(head==null){
      head=tail=newNode;
    }else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }
  }
  public void printForward(){
    Node curr=head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public void reverse(){
    if(head==null){
      return;
    }
    tail=head;
    Node curr=head;
    while(curr!=null){
      Node temp=curr.next;
      curr.next=curr.prev;
      curr.prev=temp;
      if(temp == null){
        head=curr;
      }
      curr=temp;
    }
  }
  public static void main(String[] args){
    ReverseDLL dll=new ReverseDLL();
    dll.addFirst(6);
    dll.addFirst(5);
    dll.addFirst(4);
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.printForward();
    dll.reverse();
    dll.printForward();
  }
}