public class ReverseListInKGroupsOpt{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public void print(){
    if(head==null) return;
    StringBuilder sb=new StringBuilder();
    Node curr=head;
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public Node reverseKGroup(Node head,int k){
    Node dummy=new Node(0);
    dummy.next=head;
    Node prevGroup=dummy;
    while(true){
      Node kth=prevGroup;
      int i=0;
      while(kth!=null && i<k){
        i++;
        kth=kth.next;
      }
      if(kth==null) break;
      Node nextGroup=kth.next;
      Node prev=nextGroup;
      Node curr=prevGroup.next;
      while(curr!=nextGroup){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      Node temp=prevGroup.next;
      prevGroup.next=kth;
      prevGroup=temp;
    }
    return dummy.next;
  }
  public static void main(String[] args){
    ReverseListInKGroupsOpt ll=new ReverseListInKGroupsOpt();
    ll.build(new int[]{1,2,3,4,5,6,7,8});
    ll.print();
    ll.head=ll.reverseKGroup(ll.head,2);
    ll.print();
  }
  private void build(int[] vals){
    Node dummy=new Node(-1);
    Node dumm=dummy;
    for(int val:vals){
      Node newNode=new Node(val);
      dumm.next=newNode;
      dumm=dumm.next;
    }
    this.head=dummy.next;
  }
}