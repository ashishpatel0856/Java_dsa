public  class BitManipulation {

    public static void main(String[] args) {
        printBits(48);
        // printEvenOdd(33);

        // int res1 = SetIthBits(32, 2);
        // printBits(res1);


    //   int res2=  toggleIthbit(32, 5);
    //     printBits(res2);


        //  checkPowerOfTwo(32);
         
    // int res3 = unSetBits(32,5);
    // printBits(res2);

    // int res4 = unSetRightMostSetBit(33);
    // printBits(res4);

   NoOfSetBits(48);
   

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

    public static int SetIthBits(int num ,int bit){
        return num | (1<<bit);
    }


    public static int toggleIthbit(int num ,int bit){
        return num ^ (1<<bit);
    }


    public static int unSetBits(int num,int bit){
        return num & ~(1<<bit);
    }


   public static void  checkPowerOfTwo(int num){
           if((num & num -1) == 0){
            System.out.println("number is power of two");
           } 
           else {
            System.out.println("num is not power of two");
           }
   }

   public static int unSetRightMostSetBit(int num){
    return ( num & num-1);
   }

   public static void NoOfSetBits(int num){
    int count = 0;
    while(num !=0){
        count++;
        num = unSetRightMostSetBit(num);
    }
    System.out.println(count);
   }
}