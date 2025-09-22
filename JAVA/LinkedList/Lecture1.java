public class Lecture1{
    Node<Integer> head;
    int size;

    Lecture1(){
        this.head = null;
        this.size =0;
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





    public void insertNode(int data , int position){

        if(position>size+1 || position<=0){
           System.out.println("wrong input");
           return;
        }
        // head
        if(position == 1){
            insertHead(data);
        
        } else if(position ==size +1){
            insertTail(data);
            
        }
        else {
            // at specific positions
            int counter =1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while(counter<position-1 && temp != null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        System.out.println("Insertion successful at position"+position);
    }

    public void insertHead(int data ){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
           System.out.println("insetion at head is successful");
           size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("insetion at head is successful");
        size++;
    }



    
    public void insertTail(int data ){
        Node<Integer> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            System.out.println("insetion at tail is successful");
            size++;            
            return;
        }

        Node<Integer> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("insetion at tail is successful");
        size++;
    }
}