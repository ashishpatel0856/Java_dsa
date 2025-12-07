
import java.util.*;

public class BracketBalencing {
    public static boolean  isBalanced(String str){
        Stack<Character> st = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else{ //)
                if(st.size()==0){
                    return  false;
                }
                 if(st.peek()=='(')
                    st.pop();

            }
        }
        if(st.size()!=0) return false;
        return true;
    }


        public static int  minBracketToBalanced(String str){
        Stack<Character> st = new Stack<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else{ //)
                if(st.size()==0){
                    return -1;
                }
                 if(st.peek()=='(')
                    st.pop();

            }
        }
        return st.size();
      
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(isBalanced(str));

    System.err.println("");
    System.out.println(minBracketToBalanced(str));


    }
}