public class AddOneLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
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
  public Node reverseList(Node head){
    Node curr=head,prev=null;
    while(curr!=null){
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    return prev;
  }
  public Node addOne(Node head){
    head=reverseList(head);
    Node curr=head;
    while(curr!=null){
      if(curr.val!=9){
        curr.val+=1;
        break;
      }else{
        curr.val=0;
        if(curr.next==null){
          curr.next=new Node(1);
          break;
        }
      }
      curr=curr.next;
    }
    return reverseList(head);
  }
  public static void main(String[] arfs){
    AddOneLL list=new AddOneLL();
    list.head=new Node(9);
    list.head.next=new Node(9);
    list.head.next.next=new Node(9);
    list.head.next.next.next=new Node(9);
    Node head=list.addOne(list.head);
    print(head);
  }
}