import java.util.*;

class LFUCache {
    class Node {
        int key, val, freq = 1;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }

    class DLL {
        Node head = new Node(0, 0), tail = new Node(0, 0);
        int size = 0;
        DLL() { head.next = tail; tail.prev = head; }

        void addFront(Node n) {
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;
            size++;
        }

        void remove(Node n) {
            n.prev.next = n.next;
            n.next.prev = n.prev;
            size--;
        }

        Node removeLast() {
            if (size == 0) return null;
            Node last = tail.prev;
            remove(last);
            return last;
        }
    }

    private final int capacity;
    private int minFreq = 0;
    private final Map<Integer, Node> keyMap = new HashMap<>();
    private final Map<Integer, DLL> freqMap = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    private void update(Node n) {
        DLL list = freqMap.get(n.freq);
        list.remove(n);
        if (n.freq == minFreq && list.size == 0) minFreq++;
        n.freq++;
        freqMap.computeIfAbsent(n.freq, k -> new DLL()).addFront(n);
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) return -1;
        Node n = keyMap.get(key);
        update(n);
        return n.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyMap.containsKey(key)) {
            Node n = keyMap.get(key);
            n.val = value;
            update(n);
            return;
        }

        if (keyMap.size() == capacity) {
            DLL list = freqMap.get(minFreq);
            Node evict = list.removeLast();
            keyMap.remove(evict.key);
        }

        Node n = new Node(key, value);
        minFreq = 1;
        keyMap.put(key, n);
        freqMap.computeIfAbsent(1, k -> new DLL()).addFront(n);
    }
    
  public static void main(String[] args){
    LFUCache cache = new LFUCache(2);

    cache.put(1, 10);
    cache.put(2, 20);
    System.out.println(cache.get(1));  // 10  (key 1 freq = 2)

    cache.put(3, 30);                  // full: evicts key 2 (freq 1, lowest)
    System.out.println(cache.get(2));  // -1  (evicted)
    System.out.println(cache.get(3));  // 30  (key 3 freq = 2)

    cache.put(4, 40);                  // tie: keys 1 and 3 both freq 2, evicts key 1 (older)
    System.out.println(cache.get(1));  // -1  (evicted)
    System.out.println(cache.get(3));  // 30  (key 3 freq = 3)
    System.out.println(cache.get(4));  // 40  (key 4 freq = 2)

    // capacity 0 edge case
    LFUCache zero = new LFUCache(0);
    zero.put(1, 1);
    System.out.println(zero.get(1));   // -1
    }
}