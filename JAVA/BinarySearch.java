public class BinarySearch{
    public static void  main(String[] args){
              int arr1[] = {65,71,75,76,100,112};
              idxSearch(arr1, 65);

            int arr2[] = {44,36,26,12,5,1};
            idxSearchDecreasing(arr2, 36);

            int arr3[] = {1,2,3,4,6,6,6,9,10};
            BSInfirstOccurance(arr3, 6, true);
            BSInfirstOccurance(arr3, 6, false);
 
        int nums[] = {1,3,5,5,6,7,8};
        int res[] = new int[2];
        int first=  LeetCode34(nums,5,true);
        int last = LeetCode34(nums,5 ,false);
         res[0] =first;
         res[1] = last;
          System.out.println(first+ " "+last);



        // leet code 137

        // int nums[] = {4,4,8,8,8,15,16,23,23,42};
        // int ress[] = new int[2];
        // int first=  LeetCode34(nums,5,true);
        // int last = LeetCode34(nums,5,false);
        // if(first == -1 || last == -1){
        //     System.out.println("occurance of target is 0");
        // } else 
       
        //   System.out.println("the occurance of target is :" + (last - first +1));



        int arr[] = {4,4,8,8,8,15,16,23,42};
        int ans1= binarySearchFloor(arr,17);
        System.out.println("the floor value is :"+ans1);

        int anss= binarySearchCeil(arr,6);
        System.out.println("the floor value is :"+anss);


        //leetcode744
        char[] letters = {'c', 'd', 'f'};
        char ans2 = LeetCode744(letters, 'a');
        System.out.println("The next greatest letter is: " + ans2);
          
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

    public static void BSInfirstOccurance(int arr[],int target,boolean isFirst){
          int ans = -1;
          int start = 0;
          int end = arr.length-1;
          while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid -1;
                } else {
                    start = mid+1;
                }
            }  else if(arr[mid]<target){
                start = mid +1;
            } else{
                end = mid -1;
            }
          }
          if(ans == -1){
            System.out.println("ele not found");
         } else {
            System.out.println("the index of element :"+ans);
         }
          
    }

    public static int LeetCode34(int arr[],int target,boolean isfirst){
        int ans = -1;
        int start = 0;
        int  end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;

                if(isfirst){
                    end = mid -1;
                
                 } else {
                    start = mid +1;
                 }
            } else if(arr[mid] < target){
                start = mid +1;
            } else {
                end = mid -1;
            }

        }
        return ans;
    }

    
    public static int binarySearchFloor(int arr[],int target){
        int ans = -1;
        int start = 0;
        int  end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
             if(arr[mid] < target){
                start = mid +1;
                ans = arr[mid];
            } else {
                end = mid -1;
            }
        }
        return ans;
    }

    public static int binarySearchCeil(int arr[],int target){
        int ans = -1;
        int start = 0;
        int  end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
             if(arr[mid] < target){
                start = mid +1;
                ans = arr[mid];
            } else {
                end = mid -1;
                ans = arr[mid];
            }
        }
        return ans;
    }


    public static char LeetCode744(char arr[],char target){
        char ans = '$';
        int start = 0;
        int  end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid +1;
            } else {
                end = mid -1;
                ans = arr[mid];
            }
        }
        return (ans == '$')?arr[ans]:ans;
    }
}