public class BinarySearch{
    public static void main(String[] args){
            //   int arr1[] = {65,71,75,76,100,112};
            //   idxSearch(arr1, 65);

            int arr2[] = {44,36,26,12,5,1};
            idxSearchDecreasing(arr2, 36);

    }
    public static void idxSearch(int arr[],int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid ;
                break;
            }   else if(arr[mid]<target) {
                start =  mid +1;
            } else {
                end = mid -1;
            }
        }
        if(ans == -1){
            System.out.println("ele not found");
         } else {
            System.out.println("the index of element :"+ans);
         }
    }

    public static void idxSearchDecreasing(int arr[],int target){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid ;
                break;
            }   else if(arr[mid]<target) {
                end = mid -1;
                
            } else {
                start =  mid +1;
            }
        }
        if(ans == -1){
            System.out.println("ele not found");
         } else {
            System.out.println("the index of element :"+ans);
         }
    }
}