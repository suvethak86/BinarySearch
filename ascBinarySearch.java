import java.util.*;
public class ascBinarySearch {
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        Boolean asc=false;
        if(arr[start]<arr[end]){
            asc= true;
        }
         while(start<=end){
           int mid=(start+end)/2;
           if(asc){
             if(target>arr[mid])
             start=mid+1;
             else if(target<arr[mid])
             end=mid-1;
             else
             return mid;
         }
        }
         return -1;
     }
     public static void main(String args[]){
         int arr[]={1,1,1,6,10,12,13,20,21,28};
         int target=12;
         int res=binarySearch(arr,target);
         System.out.println(res);
     }
     
 
}
