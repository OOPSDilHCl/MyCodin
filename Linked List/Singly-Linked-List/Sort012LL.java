public class Sort012LL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
 public static Node sort012LL(Node head){
    if(head==null) return head;
    Node d0=new Node(-1),d1=new Node(-1),d2=new Node(-1);
    Node t0=d0,t1=d1,t2=d2;
    Node curr=head;
    while(curr!=null){
        Node next=curr.next;
        curr.next=null;
        if(curr.val==0){t0.next=curr;t0=curr;}
        else if(curr.val==1){t1.next=curr;t1=curr;}
        else{t2.next=curr;t2=curr; }
        curr=next;
    }
    t0.next=(d1.next!=null)?d1.next:d2.next;
    t1.next=d2.next;
    return d0.next;
}
  public static void print(Node head){
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
  public static void main(String[] args){
    Sort012LL ll=new Sort012LL();
    Node head=build(new int[]{1,2,2,1,1,0,0,2});
    print(head);
    head=sort012LL(head);
    print(head);
  }
  private static Node build(int[] vals){
    Node dummy=new Node(-1);
    Node dumm=dummy;
    for(int val:vals){
      Node newNode=new Node(val);
      dumm.next=newNode;
      dumm=dumm.next;
    }
    return dummy.next;
  }
}