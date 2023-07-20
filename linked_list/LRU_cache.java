class Node{
    int key;
    int val;

    Node next;
    Node prev;

    public Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    private Map<Integer,Node> cache;
    private int capacity;

    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        this.left = new Node(0,0);
        this.right = new Node(0,0);

        left.next = right;
        right.prev = left;
        
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).val;
        }

        else return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) remove(cache.get(key));

        cache.put(key,new Node(key,value));
        insert(cache.get(key));

        if(cache.size() > capacity){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node){
        Node prev = this.right.prev;
        Node next = this.right;

        node.next = next;
        node.prev = prev;
        next.prev = node;
        prev.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
