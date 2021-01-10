package week8;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Node> map;
    private DoubleList list;
    private int capacity;
    public LRUCache(int capacity) {
        map = new HashMap<Integer, Node>();
        list = new DoubleList();
        this.capacity = capacity;
    }
    // 从hash表取，取不到为-1，存在的话从链表删除再添加到尾
    public int get(int key) {
        if(map.containsKey(key)){
            deleteAndAdd(key);
            return map.get(key).value;
        }
        return -1;
    }

    // 如果存在则更新value,然后删除再添加到尾，如果不存在看链表长度是否等于capacity,等于则删除头再添加到尾
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).value = value;
            deleteAndAdd(key);
            return;
        }
        if(capacity == list.getSize()){
            Node x = list.removeFirst();
            map.remove(x.key);
        }
        Node x = new Node(key, value);
        list.addLast(x);
        map.put(key, x);
    }

    public void deleteAndAdd(int key){
        Node x = map.get(key);
        list.remove(x);
        list.addLast(x);
    }
}


class Node {
    public int key;
    public int value;
    public Node pre;
    public Node next;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class DoubleList{
    private Node head;
    private Node tail;
    private int size;
    public DoubleList(){
        head = new Node(0, 0);
        tail = new Node(0 ,0);
        head.next = tail;
        tail.pre = head;
        size = 0;
    }

    public void addLast(Node x){
        x.next = tail;
        x.pre = tail.pre;
        tail.pre.next = x;
        tail.pre = x;
        size++;
    }

    public void remove(Node x){
        x.pre.next = x.next;
        x.next.pre = x.pre;
        size--;
    }

    public Node removeFirst(){
        if(head.next == null){
            return null;
        }
        Node first = head.next;
        remove(first);
        return first;
    }

    public int getSize(){
        return size;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
