public class IntersectionLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head1,head2;
  public Node getIntersectionNode(Node headA,Node headB){
    Node A=headA,B=headB;
    while(A!=B){
      A=A.next;
      B=B.next;
      if(A==B) return A;
      if(A==null) A=headB;
      if(B==null) B=headA;
    }
    return null;
  }
  public static void main(String[] args){
  IntersectionLL ll=new IntersectionLL();
    ll.head1=new Node(1);
    ll.head1.next=new Node(3);
    ll.head1.next.next=new Node(2);
    ll.head1.next.next.next=new Node(5);
ll.head1.next.next.next.next=new Node(4);
    ll.head2=new Node(5);
    ll.head2.next=ll.head1.next.next;
 Node intersection=ll.getIntersectionNode(ll.head1,ll.head2);
    if(intersection==null){
  System.out.println("No Intersection.");
    }else{
   System.out.println(intersection.val);
    }
  }
}