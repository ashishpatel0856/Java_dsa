public class basicFunc {
    public static void main(String args[]){
        basicFunc myfn = new basicFunc();
        myfn.calculateArea(2, 5);

        int num1=10;
        int num2 = 20;
        myfn.swap(num1,num2);
        // System.out.println(num1+" "+ num2);

        long num3=17;
        long num4 = 20;
        myfn.swap(num3,num4);
        myfn.swap(num1,num3);
        myfn.swap();


        long num5 = 75;
        int num6 = 53;
        myfn.swap(num5,num6);

    }

    public void swap(int val1,int val2){
        // System.out.println(val1+" "+ val2);

        int temp =val1;
        val1 = val2;
        val2= temp;
        System.out.println("A"+val1+" "+ val2);

    }

    public void swap(long  val1,long val2){
        long temp =val1;
        val1 = val2;
        val2= temp;
        System.out.println("B"+val1+" "+ val2);
    }

    
    public void swap(long  val1,int val2){
        long temp =val1;
        val1 = val2;
        val2= (int)temp;
        System.out.println("C"+val1+" "+ val2);
    }


    public void swap(){
        
        System.out.println("D"+ "JAVA FUNCTION OVERRIDING");
    }

    public void calculateArea(int len ,int wid){
        System.out.println(len*wid);
    }
}