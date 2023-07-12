class MyLinkedList {

    ArrayList<Integer> arr;

    public MyLinkedList() {
        arr = new ArrayList<>();
    }
    
    public int get(int index) {
        if(index < arr.size()) return arr.get(index);
        return -1;
    }
    
    public void addAtHead(int val) {
        arr.add(0,val);
    }
    
    public void addAtTail(int val) {
        arr.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index <= arr.size()) arr.add(index,val);
    }
    
    public void deleteAtIndex(int index) {
        if(index < arr.size()) arr.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
