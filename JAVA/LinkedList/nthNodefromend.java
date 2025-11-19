
public class nthNodefromend {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode(Node head,int n){
        int size =0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
    int m = size-n+1;
    // mth node form start
    temp = head;
    for(int i=1;i<=m-1;i++){
        temp=temp.next;

    }
    return temp;
    }

    public static Node nthNode2(Node head ,int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static Node deleteNthfromEnd(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;

        }
         // delete for 0th element
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
           slow = slow.next;
           fast = fast.next;
        }
        slow.next=slow.next.next;
        return head; // deleted for oth ele
        
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(7);
        Node c = new Node(12);
        Node d = new Node(30);
        Node e = new Node(11);
        Node f = new Node(110);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node ans = nthNode(a,2);
        System.out.println(ans.data);
        Node ass = nthNode2(a,3);
        System.out.println(ass.data);

        display(a);
        a= deleteNthfromEnd(a, 6);
        System.out.println("");
        display(a);
        
        
    }
}
