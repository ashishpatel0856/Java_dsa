
import java.util.Stack;

class StackrevRecursion{
    public static void displayRev(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
    }

    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRev(st);
        System.out.print(top+" ");
        st.push(top);
    }
    


    public static void pushAtBottomRec(Stack<Integer> st,int x){

      if(st.isEmpty()){
        st.push(x);
        return;
      }
      int top = st.pop();
      pushAtBottomRec(st, x);
      st.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st); 
        System.err.println("");
        System.out.println(st+" ");
        displayRev(st);
        System.err.println(" ");

       pushAtBottomRec(st, 9);
       System.out.print(st);
    }
}