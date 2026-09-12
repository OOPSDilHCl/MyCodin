public class RemoveDuplicatesDLL{
  public void build(int[] vals){
    for(int val:vals){
      Node node=new Node(val);
      if(head==null){
        head=tail=node;
      }else{
        node.prev=tail;
        tail.next=node;
        tail=node;
      }
    }
  }
  private static class Node{
    int val;
    Node prev,next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head,tail;
  public void removeDuplicates(){
    if(head==null) return;
    Node curr=this.head;
    while(curr!=null){
      Node next=curr.next;
      if(curr.prev!=null && curr.prev.val==curr.val){
        curr.prev.next=curr.next;
        if(curr.next!=null)
          curr.next.prev=curr.prev;
        else tail=curr.prev;
      }
      curr=next;
    }
  }
  public void print(){
    Node curr=this.head;
    StringBuilder sb=new StringBuilder();
    sb.append("null");
    while(curr!=null){
      sb.append("←→").append(curr.val);
      curr=curr.next;
    }
    sb.append("←→null");
    System.out.println(sb);
  }
  public static void main(String[] args){
    RemoveDuplicatesDLL list=new RemoveDuplicatesDLL();
  list.build(new int[]{1,1,1,1,2,2,2,3,3,4,6,6});
    list.print();
    list.removeDuplicates();
    list.print();
  }
}