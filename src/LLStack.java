public class LLStack<T> {
    int size;
    LinkedList<T> ll;

    public LLStack() {
        size = 0;
        ll = new LinkedList<>();
    }

    void push(T d) {
        ll.insertAtStart(d);
        size++;
    }

    T pop() {
        T data = ll.head.data;
        ll.deleteAtStart();
        size--;
        return data;
    }

    T peek() {
        return ll.head.data;
    }

    int size() {
        return size;
    }
    
    
    //returns boolean 
    boolean isEmpty() {
        return size == 0;
    }

}
