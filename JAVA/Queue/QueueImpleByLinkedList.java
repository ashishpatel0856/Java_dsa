public class QueueImpleByLinkedList {

    class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    void add(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int remove(){
        if(size == 0){
            System.out.print("empty queue");
            return -1;
        }

        int front = head.val;
        head = head.next;
        size--;

        if(head == null) {
            tail = null; // FIXED
        }

        return front;
    }

    int peek(){
        if(size == 0){
            System.out.print("empty queue");
            return  -1;
        }
        return head.val;
    }

    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImpleByLinkedList q = new QueueImpleByLinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.Display();

        System.out.println("Removed: " + q.remove());
        q.Display();

        System.out.println("Peek: " + q.peek());
    }
}
