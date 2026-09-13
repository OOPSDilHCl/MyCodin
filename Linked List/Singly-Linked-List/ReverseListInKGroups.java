public class ReverseListInKGroups{
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
    Node curr=head;
    int cnt=0;
    while(curr!=null && cnt<k){
      cnt++;
      curr=curr.next;
    }
    if(cnt<k){
      return head;
    }
    Node prev=reverseKGroup(curr,k);
    curr=head;
    for(int i=0;i<k;i++){
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    return prev;
  }
  public static void main(String[] args){
    ReverseListInKGroups ll=new ReverseListInKGroups();
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