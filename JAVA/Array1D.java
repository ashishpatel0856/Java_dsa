
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        int rollNo[] = new int[7];
        //int age[];
        //age = new int[7];
        int dummy[]= {3,35,7,6,36,3,37};
       rollNo[0]=345;

        Scanner sc = new Scanner(System.in);
        for (int i =0;i<rollNo.length;i++){
           System.out.println("enter "+i+" element");
           int element = sc.nextInt();
           rollNo[i] = element;
        }
        printArray(rollNo);

        insert(rollNo, 2, 48);
        printArray(rollNo);

    }

    public static void insert(int arr[],int pos,int element){
           //overflow conditions of array 
           int size = arr.length;
           if(pos<0 || pos>size-1){
               System.out.println("wrong positions");
               return;
           }
           for(int i=size-2;i>=pos;i--){
            arr[i+1] = arr[i];
           }
           arr[pos]=element;
    }







    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}