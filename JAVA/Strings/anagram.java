class anagram {
    public static void main(String[] args){
       isAnagram("ashish","kareena");
       
    }
    public static void isAnagram(String a , String b){
        if(a.length() != b.length()){
            System.out.println("false");
            return;
        }
        int freq[] = new int[26];
        int len = a.length();
        int indexA =0;
        int indexB =0;
        while(indexA<len && indexB<len){
            char charA = a.charAt(indexA);
            int freqIndexA = charA -97;
            freq[freqIndexA] +=1;

            char charB = b.charAt(indexB);
            int freqIndexB = charB -97;
            freq[freqIndexB] -=1;
            
            indexA++;
            indexB++;
        }
        for(int i =0;i<26;i++){
            if(freq[i] !=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}