
public class Imple{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
  
    // public static void insertAtEndval(Node head,int val){
    //   Node temp = new Node(val);
    //   Node t = head;
    //   while(t.next!=null){
    //     t=t.next;
    //   }
    //   t.next=null;
    // }
     
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

       void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){//empty list
        head =temp;
        tail = temp;
        } else{ // non empty
           temp.next = head;
           head =temp;
        }
       }


       void insertAtPosition(int idx,int val){
          Node t = new Node(val);
          Node temp = head;
          if(idx==size()){
            insertAtEnd(val);
            return;
          } else if(idx ==0){
            insertAtHead(val);
            return ;
          } else if(idx<0){
            System.out.println("wrong idx");
            return;
          } else if(idx>size()){
            System.out.println("wrong idx");
            return;
          }


          for(int i=1;i<idx-1;i++){
            temp = temp.next;
          }
          t.next = temp.next;
          temp.next=t;

       }


    int size(){
    int count = 0;
    Node temp = head;
    while(temp != null){
        count++;
        temp = temp.next;
    }
    return count;
   }


  int getAtval(int idx){
    Node temp = head;
    for(int i=1;i<=idx;i++){
      temp = temp.next;
    }
    return temp.data;
  }




  //  deleting the value in linkedlist

  void deleteAt(int idx){
   
    Node temp = head;
    int size;
     if(idx==0){
      head = head.next;
      size=size()-1;
    }
    for(int i =1;i<=idx-1;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
    tail=temp;
    size=size()-1;
  }

       void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
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
       System.out.println("");
       ll.insertAtHead(91);
       ll.display();
     System.out.println("");
     ll.insertAtPosition(5, 50);
     ll.display();
     System.err.println("");
     System.out.println(ll.getAtval(3));//10
     System.err.println("");
     ll.deleteAt(0);
     ll.display();
    


    }
}