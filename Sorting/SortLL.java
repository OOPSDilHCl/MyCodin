public class SortLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
 public Node merge(Node left,Node right){
    Node dummy=new Node(-1);
    Node temp=dummy;
    while(left!=null && right!=null){
      if(left.val<=right.val){
        temp.next=left;
        left=left.next;
      }else{
        temp.next=right;
        right=right.next;
      }
      temp=temp.next;
    }
    while(left!=null){
      temp.next=left;
      left=left.next;
      temp=temp.next;
    }
    while(right!=null){
      temp.next=right;
      right=right.next;
      temp=temp.next;
    }
    return dummy.next;
  }
  public Node mergeSort(Node head){
    if(head==null || head.next==null){
      return head;
    }
    Node middle=findMiddle(head);
    Node left=head,right=middle.next;
    middle.next=null;
    left=mergeSort(left);
    right=mergeSort(right);
    return merge(left,right);
  }
  public Node findMiddle(Node head){
    if(head==null || head.next==null){
      return head;
    }
    Node slow=head,fast=head.next;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
  }
  public void printList(Node head){
    if(head==null){
      throw new java.util.NoSuchElementException("List is empty!");
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
    SortLL ll=new SortLL();
    ll.head=new Node(1);
    ll.head.next=new Node(4);
    ll.head.next.next=new Node(2);
    ll.head.next.next.next=new Node(3);
    ll.head.next.next.next.next=new Node(9);
    ll.head.next.next.next.next.next=new Node(6);
    Node result=ll.mergeSort(ll.head);
    ll.printList(result);
  }
}