
public class Imple{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }

     
    public static class linkedlist{
       Node head = null;
       Node tail = null;
       void insertAtEnd(int val){
        Node temp = new Node(val);
        
        if(head ==null){
            head = temp;
            // tail=temp;
        }
        else{
            tail.next = temp;
    
        }
        tail = temp;
       }

       void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
       }
    }
    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.insertAtEnd(7);
      ll.insertAtEnd(81);
      ll.insertAtEnd(10);
      ll.display();
       ll.insertAtEnd(20);
       System.out.println("");
       ll.display();
    }
}