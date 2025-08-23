import java.util.Stack; 
public class BracketBalencing {

    public static void main(String[] args){
      int res = countReverse("{}}{}{}{{}}}");
      System.out.println(res);
    }
    public static int countReverse(String s){
        int n = s.length();
        if(n%2 !=0){
            return -1;
        }

        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<n;i++){
            char ch = s.charAt(i);
            if(ch=='{'){
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.peek()=='}'){
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        int ans =0 , open = 0 , close =0;
        while(!stack.isEmpty()){
            char top = stack.pop();
            if(top =='{'){
                open++;
            } else {
                close++;
            }
        }
        ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }
}