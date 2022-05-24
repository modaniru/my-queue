package Object;

public final class LinkedQueue<T> {

    private class Node<T>{
        private Node<T> next;
        private T value;


        public Node(T value){
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getValue() {
            return value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    private Node<T> top = null;
    private Node<T> instance;

    public void push(T obj){
        if(top == null){
            top = new Node(obj);
            instance = top;
            return;
        }
        while(instance.getNext() != null){
            instance = instance.getNext();
        }
        instance.setNext(new Node(obj));
        instance = top;
    }

    public void printQueue(){
        System.out.print("[ ");
        while (instance != null){
            System.out.print("\"" + instance + "\" ");
            instance = instance.getNext();
        }
        System.out.println("]");
        instance = top;
    }

    public T pop() throws Exception {
        if(top == null) throw new Exception("Нет элементов в очереди");
        T element = top.getValue();
        top = top.getNext();
        instance = top;
        return element;
    }

    public int size(){
        int size = 0;
        while (instance != null){
            size++;
            instance = instance.getNext();
        }
        instance = top;
        return size;
    }

    public T back(){
        while(instance.getNext()!=null){
            instance = instance.getNext();
        }
        return instance.getValue();
    }

    public T front(){
        return top.getValue();
    }

    public boolean isEmpty(){
        return top==null;
    }

    public LinkedQueue<T> copy(){
        LinkedQueue<T> q = new LinkedQueue<T>();
        while(instance!=null){
            q.push((T)instance);
            instance = instance.getNext();
        }
        instance = top;
        return q;
    }
}
