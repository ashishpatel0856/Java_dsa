public class LinearSearch{
    public static void main(String[] args){
 
        // int arr[] = {5,8,2,6,2,4,7,2,1};
        // search(arr,20);
        // linearSearchMultiple(arr, 2);
        // findMaxele(arr);
        // findminElement(arr);



        int arr2d[][]={
            {5,6,2,3},
            {2,3,9,0},
            {1,75,8,3}
        };
        // LinearSearchIn2dArr(arr2d, 75,false);// first occurance
        // LinearSearchIn2dArr(arr2d, 75, true);// last occurance
        // LinearSearchMultipleIn2darr(arr2d,3);
         findMaxSumSubarray(arr2d);

    }
    public static void search(int arr[],int target){
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans = i;
                break;
            }
        }
        if(ans ==-1){
            System.out.println("element is not present in array"+target);
        } else {
            System.out.println("found element postion:"+ ans);
        }
    }


    public static void linearSearchMultiple(int arr[],int target){
        int ans[] = new int[arr.length];
        int k =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                ans[k] = i;
                k++;

            }
           
        }

        if(k == 0){
                System.out.println("element is not present in array");
            }
            else{
                for(int i=0;i<k;i++){
                    System.out.println("the found element is :"+arr[i]);
                }
        }
    }


    public static void findMaxele(int arr[]){
        // int max = arr[0];or
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("the maximum element is:"+max);
    }

    public static void findminElement(int arr[]){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                
            }
        }
        System.out.println("the minimum ele is :"+min);

    }


    public static void LinearSearchIn2dArr(int arr[][],int target,boolean findLast){
        int outerIndex = -1;
        int InnerIndex = -1;
        for(int i = 0;i<arr.length;i++){
            boolean found = false;
            for(int j =0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    outerIndex =i;
                    InnerIndex = j;
                    
                    }
                }
                if(findLast == false){
                    found = true;
                    break;
            }
        }
        if(outerIndex == -1){
            System.out.println("the element is not present in 2d array");
        } else{
            System.out.println("the found element is:"+outerIndex+","+InnerIndex);
        }
    }


    public static void LinearSearchMultipleIn2darr(int arr[][],int target){
        // int size = arr.length * arr[0].length;
        // to find the the size of array 2d;
        int size = 0;
        for(int i =0;i<arr.length;i++){
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k=0;
        for(int i =0;i<arr.length;i++){
            boolean found = false;
            for(int j =0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    ans[k][0] =i;
                    ans[k][1]=j;
                    k++;
                }
            }
            if(found == true){
                break;
            }
          
            }
            if(k==0){
                System.out.println("no element in 2d array");
            } else{
                for(int i =0;i<k;i++){
                    System.out.println("found element pos is:"+arr[i][0]+","+arr[i][1]);
                }
        }
    }


   public static void findMaxSumSubarray(int arr[][]){
    int max = Integer.MIN_VALUE;
    int resIndex = -1;
    for(int i=0;i<arr.length;i++){
        int sum =0;
        for(int j=0;j<arr[i].length;j++){
            sum = sum + arr[i][j];

        }
        if(sum>max){
            max = sum;
            resIndex =i;
        }
    }
    System.out.println("maximum sum subarray is:"+max+"for the indeex:"+resIndex);
   }


   
}