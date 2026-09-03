public class DoublyLinkedList<T>{
  private static class Node<T>{
    T val;
    Node<T> prev;
    Node<T> next;
    Node(T val){
      this.val=val;
    }
  }
  private Node<T> head;
  private Node<T> tail;
  private int size;
  public void size(){
    System.out.println(size);
  }
  public void addFirst(T val){
    Node<T> newNode=new Node<>(val);
    if(head==null){
      head=tail=newNode;
    }else{
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }
    size++;
  }
  public void addLast(T val){
    Node<T> newNode=new Node<>(val);
    if(tail==null){
      head=tail=newNode;
    }else{
      newNode.prev=tail;
      tail.next=newNode;
      tail=newNode;
    }
    size++;
  }
  public T removeFirst(){
    if(head==null){
      throw new java.util.NoSuchElementException();
    }
    T data=head.val;
    head=head.next;
    if(head==null){
      tail=null;
    }else{
      head.prev=null;
    }
    size--;
    return data;
  }
  public T removeLast(){
    if(tail==null){
      throw new java.util.NoSuchElementException();
    }
    T data=tail.val;
    tail=tail.prev;
    if(tail==null){
      head=null;
    }else{
      tail.next=null;
    }
    size--;
    return data;
  }
  public void printForward(){
    Node<T> curr=head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("->");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public void printBackward(){
    Node<T> curr=tail;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("->");
      curr=curr.prev;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public static void main(String[] args){
    DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
    list.addFirst(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);
    list.addFirst(2);
    list.addFirst(1);
    list.printForward();
    list.printBackward();
    list.size();
  System.out.println(list.removeLast());
    list.size();
    list.removeLast();
    list.size();
    list.printForward();
    System.out.println(list.removeFirst());
    list.printForward();
    list.size();
  }
}