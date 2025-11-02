
import java.util.HashMap;
public class MostFreqEle{
    public static void main(String[] args){
        int arr[]={2,52,4,7,2,5,5,4,2,6,6,54,6,2};
        int ans = mostFreqEle(arr);
        System.out.println("ans ->"+ans);
    }
    public static int mostFreqEle(int arr[]){
        HashMap<Integer ,Integer> freq = new HashMap<>();
        int ans =-1;
        int maxf = 0;
        for(int i =0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                int val = freq.get(arr[i]);
                val = val+1;
                freq.put(arr[i],val);
            } else {
                freq.put(arr[i],1);
            }
            if(freq.get(arr[i])>maxf){
                maxf= freq.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }
}