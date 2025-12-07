public class LLimplementations{
    class Node {
        int val;
        Node next;
        public Node( int val) {
            this.val = val;
        } 
    }
    

    
       Node head = null;   
       int size =0;

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){
        if(head ==null){
            System.err.println("stack is underflow");
            return  -1;
        }
        int x = head.val;
        head = head.next;
        return x;


    }

    int peek(){
        if(head == null){
            System.err.println("stack is underflow");
            return -1;
        }
        return head.val;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return  false;
    }

    void displayrev(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.err.println("");
    }

    void displayrec(Node h){
        if(h==null) return;
        displayrec(h.next);
        System.out.print(h.val+" ");

    }
    void displayOriginal(){
        displayrec(head);
        System.err.println( );
    }

    public static void main(String[] args) {
        
    LLimplementations stack = new LLimplementations();
      stack.push(90);
      stack.push(10);
      stack.push(23);
      stack.push(85);

      stack.displayrev();
      stack.displayOriginal();
      System.err.println("pop ele "+stack.pop());
       System.err.println("peek ele "+stack.peek());
    }
}