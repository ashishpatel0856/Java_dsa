public class BinarySearch2{
    public static void main(String[] args) {
        // int arr[] ={3,5,8};
        // findMinimunAbsoluteDiff(arr, 6);

        int infi[] = {12,17,19,28,30,40,50,70};
        int range[] = findRangeInfiniteArray(infi, 35);
        System.out.println(range[0]+" ,"+range[1]);
    }
    public static void findMinimunAbsoluteDiff(int arr[],int target){
        if(arr.length ==0){
            return;
        }
         int ans = -1;
         int start =0 ;
         int end = arr.length -1;

         while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;                
            } else if(arr[mid]<target){    
                start = mid+1;
            }  else {             
                end = mid -1;
            }
         }

         int res = 0;
         // element does not exits

         if(ans == -1){
            if(end == -1){
                res = Math.abs(target - arr[start]);
            } else if(start == arr.length){
                res = Math.abs(target-arr[end]);
            } else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target-arr[end]);
                res = (ans1<ans2)?ans1:ans2;
            }

         }
         System.out.println("the minimum first absoulte diffence is: "+res);
    }

    static int[] findRangeInfiniteArray(int arr[],int target){
        int range[] = new int[2];
        int start = 0;
        int end =1;
        while(arr[end]<target){
            start = end;
            end = 2*end;
        }
        range[0] = start;
        range[1]=end;
        return range;
    }
}