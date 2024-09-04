import java.util.*;
public class descBinarySearch {
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        Boolean desc=false;
        if(arr[start]>arr[end]){
            desc= true;
        }
         while(start<=end){
           int mid=(start+end)/2;
           if(desc){
             if(target<arr[mid])
             start=mid+1;
             else if(target>arr[mid])
             end=mid-1;
             else
             return mid;
         }
        }
         return -1;
     }
     public static void main(String args[]){
         int arr[]={28,26,21,19,16,12,11,10,7,5};
         int target=19;
         int res=binarySearch(arr,target);
         System.out.println(res);
     }
     
 
}
