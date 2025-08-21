public class ArrayImplementations {
    int stack[];
    int top;
    int size;
    public ArrayImplementations(int stackSize){
        stack = new int[stackSize];
        size = stackSize;
        top =-1;
    }
    // inserting elements in stacks

    public void push(int elements){
        if(top>=size-1){
            System.out.println("stack is full - overflow");
            return;
        }
        top++;
        stack[top]=elements;
    }
    

    public boolean isEmpty(){
        return top ==-1;
    }

    public int size() {
        return top+1;
    }

    public int peek() {
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int pop() {
        int val = peek();
        if(val != Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    public void printStack(){
        System.out.println("printing stack");
        for(int i=0;i<=top;i++){
           System.out.print(stack[i]);
           if(i!=top){
            System.out.print(",");
           }
        }
        System.out.println();
    }
    public static void main(String[] args){
      int n =5;
      ArrayImplementations stack = new ArrayImplementations(n);
      stack.push(90);
      stack.push(10);
      stack.push(23);
      stack.printStack();
      stack.pop();
      stack.printStack();

    }
}