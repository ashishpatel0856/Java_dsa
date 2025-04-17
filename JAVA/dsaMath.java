

public class dsaMath{
    public static void main(String[] args) {
        decimalToAnyBase(32, 2);
        AnyBaseToDecimal(101,2);
        reverseNum(78984637);
        power(5, 8);
        fastExponentiation(2, 6);
    }

    static void decimalToAnyBase (int decimalNum,int base){
        int resNum = 0;
        int power = 0;
        
        while(decimalNum>0){
            int rem = decimalNum%base;
            decimalNum /=base;
            resNum += rem * Math.pow(10, power);
            power ++;
        }
        System.out.println("result is :"+ resNum);
    }


    static void AnyBaseToDecimal(int binaryNum, int base){
        int resNum =0;
        int power = 0;
        while(binaryNum>0){
            int unitDigit = binaryNum %base;
            binaryNum /=base;
            resNum += unitDigit*Math.pow(base, power);
            power++;
        }
        System.out.println("result is ="+resNum);
    }


    int resNum =0;
    static  void reverseNum(int num){
        int resNum=0;
        while(num>0){
            int digit = num % 10;
            resNum = resNum*10 + digit;
            num /=10;
        }
        System.out.println("result is :"+resNum);
    }

    static double power(int num ,int power){
        double res = 1;
        for(int i =0; i<power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }

    static double fastExponentiation(int num,int power){
        double res = 1;
        while(power >0){
            if(power %2!= 0){
                res = res * num;
            }
            power /= 2;
            num = num * num;
        }
        System.out.println(res);
        return  res;
    }
}