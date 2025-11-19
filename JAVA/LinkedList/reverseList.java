
public class reverseList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead =reverse(head.next);
        // call
        head.next.next=head;// work interchanging the connections
        head.next=null;
        return newHead;
    }

    // public static void displayrev(Node head){
    //     if(head==null) return;
    //     displayrev(head.next);
    //     System.out.print(head.data+" ");
        
    // }
public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(13);
        Node d = new Node(7);
        Node e = new Node(63);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next =null;
        System.out.println("");
        display(a);
      System.out.println("");
        Node rev = reverse(a);
        display(rev);


    }
}
