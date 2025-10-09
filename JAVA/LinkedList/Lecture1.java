public class Lecture1 {
    Node<Integer> head;
    int size;

    // Constructor
    Lecture1() {
        this.head = null;
        this.size = 0;
    }

    // Inner Node class
    class Node<T> {
        T data;
        Node<T> next;

        Node() {
            this.next = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at a specific position
    public void insertNode(int data, int position) {
        if (position > size + 1 || position <= 0) {
            System.out.println("Wrong input position: " + position);
            return;
        }

        // Insert at head
        if (position == 1) {
            insertHead(data);
        }
        // Insert at tail
        else if (position == size + 1) {
            insertTail(data);
        }
        // Insert in middle
        else {
            int counter = 1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;

            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;
            System.out.println("Insertion successful at position " + position);
        }
    }

    // Insert at head
    public void insertHead(int data) {
        Node<Integer> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Insertion at head is successful");
    }

    // Insert at tail
    public void insertTail(int data) {
        Node<Integer> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            size++;
            System.out.println("Insertion at tail is successful");
            return;
        }

        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
        System.out.println("Insertion at tail is successful");
    }

    // Display linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<Integer> temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    // delete the node at from head
    public void deleteHead(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("deletion at head is successful");
        size--;
    }


    // delete at the tail
    public void deleteTail(){
            if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            System.out.println("deletion at the tail is successful");
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while(temp.next!=null){
            prev=temp;
            temp = temp.next;
        }
        prev.next =null;
        System.out.println("deletion at tail is successfull");
        size--;
    }

    
    // delete node at the any position
    public void deleteNode(int position){
        if(position>size || position<=0){
            System.out.println("wrong input");
            return;
        }
        if(position==1){
            deleteHead();
        } else if(position==size){
            deleteTail();
        } else{
            int counter =1;
            Node<Integer> prev =null;
            Node<Integer> temp =head;
            while(counter<position && temp!=null){
                counter++;
                prev=temp;
                temp = temp.next;
            }
            prev.next=temp.next;
            temp.next=null;
            size--;
        System.out.println("deletion at position successful");

        }
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        Lecture1 list = new Lecture1();

        list.insertHead(10);
        list.insertTail(20);
        list.insertTail(30);
        list.insertNode(178, 2);
        list.insertNode(51, 1);
        list.insertNode(40, 6); 

        list.printList();

        list.deleteTail();
        list.printList();
        list.deleteHead();
        list.printList();
        list.deleteNode(3);
        list.printList();
        System.out.println("Final size of list: " + list.size);
    }
}
