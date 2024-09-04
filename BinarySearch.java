import java.util.*;
public class BinarySearch {
    static int binarySearch(int[] arr, int target){
       int start=0;
       int end=arr.length-1;
        while(start<=end){
          int mid=(start+end)/2;
            if(target>arr[mid])
            start=mid+1;
            else if(target<arr[mid])
            end=mid-1;
            else
            return mid;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,3,5,6,10,12,15,20,21,28};
        int target=12;
        int res=binarySearch(arr,target);
        System.out.println(res);
    }
    
}
