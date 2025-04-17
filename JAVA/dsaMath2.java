
import java.util.Arrays;

public class dsaMath2 {

    public static void main(String[] args){
        // countDigits(7984986);
        // countDigits(0);
        // countDigitsViaLog(5623);

        // armstrongNumber(153);
        // printAllDivisor(24);
        // primeNumber(16);
        // seiveAlgo(5);
        // GCD(0, 36);
        // euclideanGcd(1, 36);
        // efficientEuclideanGcd(24, 36);
        // lcm(24, 36);

        // fastExponentiation(446846,8,100);
        factorial(2);
    }
    public static void countDigits(int num){
        if(num==0){
            System.out.println("digits are :1");
            return;
        }
        int counter =0;
        while(num>0){
            num/=10;
            counter++;
        }
        System.out.println("digits are "+counter);
    }

    public static void countDigitsViaLog(int num){
        if(num ==0){
            System.out.println("digits are : 1");
            return;
        }
        int count = (int)(int)(Math.log(num) / Math.log(10))+1;
        System.out.println("digits are :"+count);
    }

    public static void armstrongNumber(int num){
        int res = 0;
        int copy = num;
        while(num>0){
            int digit = num % 10;
            res = res + (int)Math.pow(digit,3);
            num /=10;
        }
        System.out.println(res == copy);

    }

    public static void printAllDivisor(int num){
        int counter =1;
        int sqroot = (int)Math.sqrt(num);
        while(counter<=sqroot){
            if(num%counter == 0){
                System.out.println(counter+"is a divisor of "+num);
                int otherNumber = num/counter;
                if(otherNumber!=counter)
                System.out.println(otherNumber + "is divisor of "+num);
            }
            counter++;
        }
    }

    public static void primeNumber(int num){
        int counter =2;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
            if(num%counter == 0){
                System.out.println(num+"is not prime number");
                return ;
            }
            counter++;
        }
        System.out.println(num+"is a prime number");
    }

    public static void seiveAlgo(int num ){

        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        int counter =2;

        while(counter<=num){
            if(arr[counter]==true){
                for(int facter = counter + counter; facter<=num; facter +=counter){
                    arr[facter] = false;
                }
            }
            counter++;

        }
        for(int i =2;i<=num;i++){
            System.out.println(i +" "+arr[i]);
        }

    }


    public static  void  GCD(int num1, int num2){
        int min =(num1<=num2)?num1:num2;
        while(min>0){
            if(num1%min==0 && num2%min==0){
                System.out.println("gcd is :"+min);
                return;
            }
            min--;

        }
        int max = (num1<=num2)?num2:num1;
        System.out.println("gcd is :"+max);
        
    }


   public static void euclideanGcd(int num1 ,int num2 ){
    while(num1!=0 && num2!=0){
        if(num1>num2){
            num1 -=num2;
        } else {
            num2 -= num1;
        }
    }
    int res;
    if(num1 == 0){
        res = num2;
        System.out.println("gcd is :"+res);
    } else{
        res = num1;
        System.out.println("gcd is "+res);
    }

   }


   
   public static int efficientEuclideanGcd(int num1 ,int num2 ){
    while(num1!=0 && num2!=0){
        if(num1>num2){
            num1 %=num2;
        } else {
            num2 %= num1;
        }
    }
    int res;
    if(num1 == 0){
        res = num2;
        System.out.println("gcd is :"+res);
    } else{
        res = num1;
        System.out.println("gcd is "+res);
    }

    return res;
   }

   public static void lcm(int num1 , int num2){
    int res = (num1*num2)/efficientEuclideanGcd(num1, num2);
    System.out.println("lcm is"+res);
   }


   public static  double fastExponentiation(int num , int power , int limit ){
    double res =1;
    while(power>0){
        if(power %2!=0){
            res = ((res%limit) * (num%limit))%limit;
        }
        power /=2;
        num = ((num%limit) * (num%limit))%limit;
    }
    System.out.println(res);
    return res;
   }


   public static void factorial(int num){
    double res =1;
    while(num >0){
        res *= num;
        num--;
    }
    System.out.println(res);
   }

}