public  class BitManipulation {

    public static void main(String[] args) {
        printBits(32);
        printEvenOdd(33);
    }

    public static void printBits(int num){
        for(int i =7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }


    public static void printEvenOdd(int num){
        if(isBitSet(num, 0)){
            System.out.println("number is odd");
        }  else {
            System.out.println("number is even");
        }
    }

    public static boolean isBitSet(int num ,int bit){
        int res = num & (1<<bit);
        return (res==0)?false:true;
    }
}