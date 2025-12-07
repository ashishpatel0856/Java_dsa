import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str ="ashish and karina";
        // System.out.println(str);
        // String s = sc.next();
        // String s = sc.nextLine(); // with spaces 
        // System.out.println(s);

        // String str = "Karina";
        // System.err.println(str.length());

    //    char ch = str.charAt(1);
    //    System.out.println(ch);

    // int idx = str.indexOf('a');// retrun always first accurance
    // System.out.println(idx);


    // compareTo()

    // String gtr = "Zshish";
    // System.out.print(str.compareTo(gtr));// K-A=10 , K-Z=-15



    // String str = "ashish patel";
    // System.out.println(str.contains("s")); // true
    // System.out.print(str.endsWith("tel"));




    // sub strings
    String str = "abcde";
    // System.out.println(str.substring(2));
    
    for(int i=0;i<str.length();i++){
        for(int j =i+1;j<str.length()+1;j++){
            System.out.print(str.substring(i,j)+ " ");
        }
    }
    }
}