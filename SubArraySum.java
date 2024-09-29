import java.util.Arrays;
import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args)
    {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        int n = arr.length;
        int res=calculateSubArraySum(arr,k,n);
       System.out.println("Result is :"+res);
    }
    static int calculateSubArraySum(int arr[],int k,int n){
    int result=0;
    int prefixSum=0;
     HashMap<Integer, Integer> prevSum = new HashMap<>();
     prevSum.put(0,1);
     for (int i = 0; i < n; i++) {
        prefixSum += arr[i];
        int removeSum=prefixSum-k;
        System.out.println("removeSum :"+removeSum);
        if (prevSum.containsKey(removeSum))
        result += prevSum.get(removeSum);
        prevSum.put(prefixSum,prevSum.getOrDefault(prefixSum,0)+1);
    }
    System.out.println(prevSum.toString());
    return result;
    }
}
