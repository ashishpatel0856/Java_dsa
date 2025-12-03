
import java.util.*;

public class raghavStacks{
    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        // Stack<Integer> st = new Stack<>();
    //     System.out.println("enter the number");
    //     int n = sc.nextInt();

    //     System.out.println("enter the elements in stacks");
    //     for(int i =0;i<n;i++){
    //         int x = sc.nextInt();
    //         st.push(x);

    //     }

    //     System.out.println(st);
    



    // reverse the stack then copy one to another stacks 

    //  Stack<Integer> st = new Stack<>();
    // st.push(2);
    // st.push(3);
    // st.push(5);
    // st.push(12);
    // System.out.println(st);

    // Stack<Integer> gt = new Stack<>();
    // while(st.size()>0){
    //     gt.push(st.pop());
    // }
    // System.out.println(gt);


    // Stack<Integer> rt = new Stack<>(); 
    // while(gt.size()>0){
    //     rt.push(gt.pop());
    // }
    // System.out.println(rt);





    // insertions of stack with any index
    Stack<Integer> st = new Stack<>();
    st.push(2);
    st.push(3);
    st.push(5);
    st.push(12);
    System.out.println(st);
    int idx = 3;
    int x = 24;
     Stack<Integer> temp= new Stack<>();
    while(st.size()>idx){
        temp.push(st.pop());

    }
    st.push(x);
    while(temp.size()>0){
        st.push(temp.pop());
    }
    System.out.println(st);
    }


}