package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {12,15,18,2,5,6,8,11};

        System.out.println(rotatedCount(arr));
    }


    // binary search
    public static int binary(int [] arr,int target  ){
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = start+ ((end - start) / 2);
            if(arr[mid]==target){
                return  mid;
            }
            if(arr[mid] < target){
                start= mid+1;


            }
            else {
                end = mid-1;
            }
        }

        return -1;
    }


    // This is ciel code for finding the floor  return end at the end of the while loop
    public static int ciel(int[] arr, int target ){

        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return  mid;
            }
            if(arr[mid] < target){
                start= mid+1;


            }
            else {
                end = mid-1;
            }
        }

        return start;

    }

     // Upper  Bound : by the same method Lower bound also can be found
    public static  int upperBound( int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start < end ){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]< target){
                start = mid+1;

            }else{
                end  = mid-1;

            }



        }
        return arr[start];

    }

    public static  int firstOccurance( int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start <= end ){
            int mid = start+ ((end - start) / 2);
            if(arr[mid]==target){
                result = mid;
                end = mid-1;

            }
           else if(arr[mid] < target){
                start= mid+1;


            }
            else {
                end = mid-1;
            }
        }

        return result;



    }


    public static  int lastOccurance( int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while(start <= end ){
            int mid = start+ ((end - start) / 2);


            if(arr[mid]==target){
                result = mid;
                start= mid+1;

            }
           else if(arr[mid] < target){
                start= mid+1;


            }
            else {
                end = mid-1;
            }
        }

        return result;

    }

    //count element in sorted array

    public static  int countElement(int [] arr, int target){
        int last = lastOccurance(arr,target);
        int first = firstOccurance(arr,target);
        return  last-first+1;

        
    }

    //Nearly Sorted Array
    public static  int nearlySorted( int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = start+ ((end - start) / 2);
            if(arr[mid]==target){
                return  mid;
            }
            if(mid+1<=end &&  arr[mid+1]==target){
                return  mid+1;
            }
              if(mid-1>=start &&  arr[mid-1]==target){
                return  mid-1;
            }


            if(arr[mid] < target){
                start= mid+2;


            }
            else {
                end = mid-2;
            }
        }

        return -1;
    }

    public static int rotatedCount( int [] nums){


        int start = 0;
        int end = nums.length - 1;
        int length = nums.length;

        if(nums[0]< nums[length-1]){
            return 0;
        }

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int prev = (mid + length - 1) % length;
            int next = (mid + 1) % length;




            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            if (nums[0] <= nums[mid]) {

                start = mid + 1;
            } else if( nums[mid]<= nums[length-1] )
            {
                end = mid - 1;
            }
        }

        return 0;


    }





}
