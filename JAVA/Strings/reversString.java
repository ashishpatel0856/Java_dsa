public class reversString{

    public static void main(String[] args) {
       reverse("ashish");
       reverseUsingStringBuilder("patel");
    }
    public static void reverse(String input){
        String ans =" ";
        for(int i =0; i<input.length();i++){
          ans = input.charAt(i) + ans;
        }
        System.out.println(ans);
    }
  

    public static void reverseUsingStringBuilder(String words){
        StringBuilder res = new StringBuilder(words);
        int n = res.length();
        for(int i =0 ; i<n/2;i++){
            char firstChar = res.charAt(i);
            char lastChar = res.charAt(n-1-i);
            res.setCharAt(i, lastChar);
            res.setCharAt(n-i-1,firstChar);
        }
        System.out.println(res);
    }

}