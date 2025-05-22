public class JmpTerInterExpSearch{
    public static void main(String[] args){
         int arr[] ={2,4,7,8,11,12,17,18,20};
        //  int index = JumpSearch(arr,42);
        int index = TernarySearch(arr, 11);
         if(index == -1){
            System.out.println("element are not present in arr");
         }
        else {
            System.out.println("The element is present in array :"+index);
        }

    }
    public static int JumpSearch(int arr[] ,int target){
        int n = arr.length;
        int Bs =(int)Math.sqrt(n);
        int Si=0;
        int Ei =Bs;
        //skip or jump the non potential blocks

        while(Ei<n && arr[Ei]<=target){
            Si = Ei;
            Ei +=Bs;
            if(Ei>n){
                Ei =n;
            }
        }
        int res =-1;
        // apply linear search
        for(int i =Si;i<Ei;i++){
            if(target == arr[i]){
                res =i;
            }
        }

        return res;
    }


    public static int TernarySearch(int arr[] , int target){
        int start =0;
        int end = arr.length -1;
        int index = -1;
        while(start<=end){
            int mid1 = start + (end - start)/3;
            int mid2 = end - (end - start)/3;

            if(target<=arr[mid1]){  
                if(target == arr[mid1]){
                    index = mid1;
                    break;
                }
                end = mid1 -1;
            } else if(target>=arr[mid2]){
                if(target == arr[mid2]){
                    index = mid2;
                    break;
                }
                start = mid2 +1;
            }
            else {
                start = mid1 + 1;
                end = mid2 -1;
            }
        }
        return index;
    }
}