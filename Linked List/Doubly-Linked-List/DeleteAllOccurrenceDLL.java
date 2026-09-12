public class DeleteAllOccurrenceDLL<T>{
  private static class Node<T>{
    T val;
    Node<T> prev,next;
    Node(T val){
      this.val=val;
    }
  }
  private Node<T> head,tail;
  public static <T> void printDLL(Node<T> head){
    StringBuilder sb=new StringBuilder("null");
    Node<T> curr=head;
    while(curr!=null){
      sb.append("<->").append(curr.val);
      curr=curr.next;
    }
    sb.append("<->null");
    System.out.println(sb);
  }
public static <T>Node<T> build(T[] vals){
    Node<T> head=null,tail=null;
    for(T val:vals){
      Node<T> node=new Node<>(val);
      if(head==null){
        head=tail=node;
      }else{
        node.prev=tail;
        tail.next=node;
        tail=node;
      }
    }
    return head;
  }
  public static <T>Node<T> deleteAllOccurrenceDLL(Node<T> head,T target){
    Node<T> curr=head;
    while(curr!=null){
      Node<T> nextNode=curr.next;
      if(!curr.val.equals(target)){
        curr=curr.next;
        continue;
      }
      if(curr.prev!=null) {
        curr.prev.next=curr.next;
      }else{
        head=curr.next;
      }
      if(curr.next!=null){
        curr.next.prev=curr.prev;
      }
      curr=nextNode;
    }
    return head;
  }
  public static void main(String[] args){
    Integer[] vals={2,1,2,34,2,18,0};
    Node<Integer> head=build(vals);
    printDLL(head);
    head=deleteAllOccurrenceDLL(head,2);
    printDLL(head);
  }
}