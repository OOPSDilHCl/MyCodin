public class AddTwoLists{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  public static void print(Node head){
    StringBuilder sb=new StringBuilder();
    Node curr=head;
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb.toString());
  }
  public static Node reverseList(Node head){
    Node curr=head,prev=null;
    while(curr!=null){
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    return prev;
  }
  public static Node addTwoLists(Node list1,Node list2){
    list1=reverseList(list1);
    list2=reverseList(list2);
    int sum=0,carry=0;
    Node dummy=new Node(-1);
    Node dumm=dummy;
    while(list1!=null || list2!=null){
      sum=0;
      if(list1!=null){
        sum+=list1.val;
        list1=list1.next;
      }
      if(list2!=null){
        sum+=list2.val;
        list2=list2.next;
      }
      sum+=carry;
      dumm.next=new Node(sum%10);
      carry=sum/10;
      dumm=dumm.next;
    }
    if(carry==1){
      dumm.next=new Node(1);
    }
    return reverseList(dummy.next);
  }
  public static Node build(int[] vals){
    Node dummy=new Node(-1);
    Node dumm=dummy;
    for(int val:vals){
      dumm.next=new Node(val);
      dumm=dumm.next;
    }
    return dummy.next;
  }
  public static void main(String[] arfs){
    Node head1=build(new int[]{5,6,9});
    Node head2=build(new int[]{4,3});
    Node head=addTwoLists(head1,head2);
    print(head);
  }
}