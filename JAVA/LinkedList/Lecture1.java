public class Lecture1{
    Node<Integer> head;
    Lecture1(){
        this.head = null;
    }
    public static void main(String[] args) {
        
    }
     class Node<T> {
        T data;
        Node next;
        Node(){
            this.next = null;
        }

        Node(T data){
            this.next =null;
            this.data = data;
        }
    }
}