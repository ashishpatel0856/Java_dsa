public class Sorting{
    public static void main(String[] args){

        int arr[] = {5,1,0,9,2,7,3};
        SelectionSorting(arr);
        printArray(arr, "sorted array");

        bubbleSort(arr);
        printArray(arr, "sorted array using bubble sorting");

        brickSort(arr);
        printArray(arr, "sorted array using brick sortig");
        
    }
     public static void printArray(int arr[],String message){
        System.out.println("Printing "+ message);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void SelectionSorting(int arr[]){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            int minEl = arr[i];
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<minEl){
                    minEl=arr[j];
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;

    }


    public static void bubbleSort(int arr[]){
        int n = arr.length;
        int passes = n-2;
        for(int i =0;i<=passes;i++){
            boolean flag = false;
            for(int j =0;j<=passes-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if(!flag){
                System.out.println(flag);
                break;
            }
        }
    }

    public static void brickSort(int arr[]){
        int n = arr.length;
        boolean isSorted = false;
        while(!isSorted){
            boolean flag = false;
            // even index swapping
            for(int i =0;i<=n-2;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    flag = true;
                }
            }
            // odd index swaping
              for(int i =1;i<=n-2;i+=2){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    flag = true;
                }
            }
            if(!flag){
                isSorted = true;
                break;
            }
        }
    }

}