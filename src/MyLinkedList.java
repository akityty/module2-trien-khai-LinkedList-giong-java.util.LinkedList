public class MyLinkedList<E> {
    public MyLinkedList() {
    }

    class Node {
        private Node next;
        private Object data;

        private Node(Object data) {
            this.data = data;
        }

        private Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object e) {
        Node temp = head;
        for (int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node pre = head;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }
        Object holder = temp.getData();
        pre.next = temp.next;
        temp = null;
        numNodes--;
        return (E) holder;
    }

    public boolean remove(E e) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.getData() == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        Object result = temp.getData();
        return (E) result;
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        return get(numNodes -1);
    }
    public void clear(){
        Node temp = head;
        for(int i =0; temp != null; i++){
            temp = null;
            temp = temp.next;
        }
    }
    public void printf(){
        Node temp = head;
        for(int i = 0; temp != null; i++){
            System.out.println(temp.getData());
            temp=temp.next;
        }
    }
    public int size(){
        return numNodes;
    }
    public E clone(){
        return (E) this;
    }
    public boolean contains(E e){
        Node temp = head;
        for( int  i = 0; temp != null; i++){
            if(temp.getData()==e){
                return true;
            }
            temp =temp.next;
        }
        return false;
    }
}
