public class countingSort{
    public static void main(String[] args) {
        int arr[] = {5,1,0,9,2,7,3};
       int res[]= sorting(arr);
        printArray(res,"sorted array");

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

        public static int[] sorting(int arr[]){
            int n =arr.length;
            int k = Integer.MIN_VALUE;
            int res[] = new int[n] ;

            //find the max value
            for(int i=0;i<n;i++){
               if(k<arr[i]){
                k = arr[i];
               }
            }

            // check array is empty or not
            if(k == Integer.MIN_VALUE){
                System.out.println("given array is empty:");
               return res;
            }

            //find the frequency of elements
            int countArr[] = new int[k+1];
            for(int i=0;i<n;i++){
                int idx =arr[i];
                countArr[idx] +=1;
            }

            //find cumulative frequency 
            for(int i=1;i<=k;i++){
                countArr[i] += countArr[i-1]; 
            }

            //for sorted array
            for(int i =n-1;i>=0;i--){
                int val = arr[i];
                int countVal = --countArr[val];
                res[countVal]=val;
            }
            return res;
    }
}