public class basics1{

    public static class Node{
        int data; //value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    
    }
 
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
     public static void displayrec(Node head){
        if(head==null) return;
        
        System.out.print(head.data+" ");
         displayrec(head.next);
    }

   public static void displayreverse(Node head){
        if(head==null) return;
           displayrec(head.next);
        System.out.print(head.data+" ");
     
    }

    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(41);
        Node c = new Node(9);
        Node d = new Node(3);
        Node e = new Node(6);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next=e;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.data);

        Node temp = a;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data+"->");
        //      // 4->41->9->6->3

        //     temp = temp.next;
           
        //     }

       
        //  while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        display(a);
        System.err.println("");
        displayrec(a);
        System.err.println("");
        displayreverse(a);
         System.err.println("");

        System.err.println(length(a));
        
    }
}