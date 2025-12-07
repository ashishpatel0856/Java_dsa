public class ArrayImplementations {
 
    int[] arr = new int[4];
    int idx =0;

    void push(int x){
        if(idx == arr.length){
            System.out.print("stack is overflow");
        }
        arr[idx] =x;
        idx++;
    }

    int peek(){
        if(idx==0){
            System.out.println("stack is empty");
            return -1;
        } else {
            return arr[idx-1];
        }
    }

    int pop(){
        if(idx ==0) {
            System.out.print("stack is underflow");
            return -1;
        } 
        int top = arr[idx-1];
        idx--;
        return top; 
        
    }


    int isCapacity(){
        return arr.length;
    }

    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }

    boolean isFull(){
        if(idx == arr.length){
            return true;
        } 
        return  false;
    }

    int size(){
        return idx;
    }
    void display(){
        for(int i =0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
   
    
    public static void main(String[] args){
    
      ArrayImplementations stack = new ArrayImplementations();
      System.err.println(stack.isEmpty());
      stack.push(90);
      stack.push(10);
      stack.push(23);
      stack.push(85);
      System.err.println(stack.size());
      
      stack.display();
      System.out.println("peek ele"+stack.peek());
      System.out.println("pop element"+ stack.pop());
      stack.display();
   

    }
}