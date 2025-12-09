
import java.util.Stack;

public class prefixTopostfix{
    public static void main(String[] args) {
       String prefix ="-9/*+5346";
       Stack<String> val = new Stack<>();
       for(int i = prefix.length()-1;i>=0;i--){
        char ch =prefix.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57){
            val.push(ch+"");
        } else {
             String v1 = val.pop();
             String v2 = val.pop();
             char op = ch;

             // v1 v2 op

             String t = v1+v2+op;
             val.push(t);

        }
        
       }
       System.out.print(val.pop());

    }
}