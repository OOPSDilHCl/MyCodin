import java.util.HashMap;
import java.util.Map;
public class LRUCache{
  class Node{
    int key,val;
    Node prev,next;
    Node(int k,int v){ key=k; val=v; }
  }
  private final int capacity;
  private final Map<Integer, Node> map=new HashMap<>();
  private final Node head=new Node(0,0), tail=new Node(0,0);
  public LRUCache(int cap){
    capacity=cap;
    head.next=tail;
    tail.prev=head;
  }
  private void remove(Node n){
    n.next.prev=n.prev;
    n.prev.next=n.next;
  }
  private void addFront(Node n){
    n.next=head.next;
    n.prev=head;
    head.next.prev=n;
    head.next=n;
  }
  public int get(int key){
    if(!map.containsKey(key)) return -1;
    Node n=map.get(key);
    remove(n);
    addFront(n);
    return n.val;
  }
  public void put(int key,int val){
    if(map.containsKey(key)){
      Node n=map.get(key);
      n.val=val;
      remove(n);
      addFront(n);
      return;
    }
    if(map.size()==capacity){
      Node lru=tail.prev;
      remove(lru);
      map.remove(lru.key);
    }
    Node n=new Node(key,val);
    map.put(key,n);
    addFront(n);
  }
  public static void main(String[] args){
    LRUCache cache=new LRUCache(7);
    cache.put(1,1);
    cache.put(2,2);
    System.out.println(cache.get(1));
    cache.put(3,3);
    System.out.println(cache.get(2));
    System.out.println(cache.get(4));
    cache.put(4,4);
    System.out.println(cache.get(1));
    System.out.println(cache.get(3));
    System.out.println(cache.get(4));
  }
}