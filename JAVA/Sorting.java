public class Sorting{
    public static void main(String[] args){

        // int arr[] = {5,1,0,9,2,7,3};
        // SelectionSorting(arr);
        // printArray(arr, "sorted array");

        // bubbleSort(arr);
        // printArray(arr, "sorted array using bubble sorting");

        // brickSort(arr);
        // printArray(arr, "sorted array using brick sortig");
        
    //     int arr[] = {2,1,0,6,8,1,2,5,8};
    //    int res[] = countingSort(arr);
    //    printArray(res, "counting sort");

          int arr[] ={603,85,7,4,12,1000,282,10};
          radixSort(arr);
          printArray(arr, "radix sort");

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

    public static int[] countingSort(int arr[]){
        // find max = k
        int n = arr.length;
        int k = Integer.MIN_VALUE;
        int res[] = new int[n];
        for(int i =0;i<n;i++){
          if(arr[i]>k){
            k = arr[i];
          }
        }

        if(k == Integer.MIN_VALUE){
            return res;
        }
      
        //  find the frequency of arr elements
        int countArr[] = new int[k+1];
        for(int i =0;i<n;i++){
            int idx = arr[i];
            countArr[idx] +=1;
        }


        // find cumulative frequency 
        for(int i =1;i<=k;i++){
            countArr[i] += countArr[i-1];
        }

        //find the final sorted array
        for(int i =n-1;i>=0;i--){
            int val = arr[i];
            int countVal = --countArr[val];
            res[countVal] = val;
        }
        return res;
    }


    public static void countingSortWithDigits(int arr[] , int digits){
        int n = arr.length;
        int k = 9;
        int res[] = new int[n];
    
        //  find the frequency of arr elements
        int countArr[] = new int[k+1];
        for(int i =0;i<n;i++){
            int idx =( arr[i]/digits)%10;
            countArr[idx] +=1;
        }


        // find cumulative frequency 
        for(int i =1;i<=k;i++){
            countArr[i] += countArr[i-1];
        }

        //find the final sorted array
        for(int i =n-1;i>=0;i--){
            int val = arr[i];
            int idx =( arr[i]/digits)%10;

            int countVal = --countArr[idx];
            res[countVal] = val;
        }

        // copy back to original array
        for(int i =0;i<n;i++){
            arr[i] =res[i];
        }
    
    }
   
    public static void radixSort(int arr[] ){
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>maxEl){
                maxEl = arr[i];
            }
        }
        if(maxEl == Integer.MIN_VALUE){
            System.out.println("empty array");
            return;
        }
        for(int digit = 1;maxEl/digit > 0;digit *=10 ){
            countingSortWithDigits(arr, digit);
        }
    }
}