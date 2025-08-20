public class palindromeString {
public static void main(String[] args) {
    pallindrome("naman");
}
public static void pallindrome(String input){
    int start = 0;
    int end = input.length()-1;
    while(start<end){
    if(input.charAt(start) != input.charAt(end)){
        System.out.println("false");
        return;
    } 
    start++;
    end--;
    
}
System.out.println("True");
}
}