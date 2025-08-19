public class leetCode151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = reverseWords(s);
        System.out.println(result); // Output: "blue is sky the"
    }

    public static String reverseWords(String s) {
      String arr[] = s.split(" ");
      StringBuilder rev = new StringBuilder();
      for(int i = arr.length - 1; i >= 0; i--) {
        if(arr[i].length()==0) {
        continue; // Skip empty strings
        }
       if(rev.length( )== 0){
        rev.append(arr[i]);
       }
       else {
        rev.append(" ").append(arr[i]);
       }
    }
      return rev.toString();
    }
}