public class FlattenLL{
  private static class Node{
    int val;
    Node next,child;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public Node flattenLL(Node head){
    if(head==null || head.next==null){
      return head;
    }
    head.next=flattenLL(head.next);
    head=mergeLL(head,head.next);
    return head;
  }
  //Iterative approach
  public void flattenLLIterate(){
    if(head==null){
      return;
    }
    Node curr=this.head;
    Node next=this.head.next;
    while(next!=null){
      curr=mergeLL(curr,next);
      next=next.next;
    }
    this.head=curr;
  }
  public Node mergeLL(Node a,Node b){
    Node dummy=new Node(-1);
    Node res=dummy;
    while(a!=null && b!=null){
      if(a.val<=b.val){
        res.child=a;
        res=a;
        a=a.child;
      }else{
        res.child=b;
        res=b;
        b=b.child;
      }
    }
    if(a!=null) res.child=a;
    else res.child=b;
    return dummy.child;
  }
  public void print(){
    Node curr=this.head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.child;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public static void main(String[] args){
    FlattenLL list=new FlattenLL();
    list.head=new Node(3);
    list.head.next=new Node(2);
    list.head.next.child=new Node(10);
    list.head.next.next=new Node(1);
  list.head.next.next.child=new Node(7);
  list.head.next.next.child.child=new Node(11);
  list.head.next.next.child.child.child=new Node(12);
  list.head.next.next.next=new Node(4);
    list.head.next.next.next.child=new Node(9);
  list.head.next.next.next.next=new Node(5);
  list.head.next.next.next.next.child=new Node(6);
  list.head.next.next.next.next.child.child=new Node(8);
     list.head=list.flattenLL(list.head);
     list.print();
  }
}