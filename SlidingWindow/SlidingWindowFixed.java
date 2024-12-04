package SlidingWindow;

import java.util.*;


public class SlidingWindowFixed {
    public static void main(String[] args) {
        int [] arr = {5,7,1,4};
        System.out.println(sumOfSubArray(arr, 3));
    }
    //Power of kth subarray
    public static  int[] powerOfSubArray(int [] arr, int k){

        int n = arr.length;
        int [] ans = new int[n-k+1];
        java.util.Arrays.fill(ans, -1);
        int count = 1;

        for (int i = 1; i< k;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }else{
                count=1;

            }
        }


        if(count== k){
            ans[0] = arr[k-1];
        }
        int i = 1;
        int j = k;

        while (j<n){
           if(arr[j]==arr[j-1]+1){
               count++;
           }else{
               count= 1;
           }

           if(count>= k){
               ans[i] = arr[j];
           }
           i++;
           j++;
        }

        return ans;

    }
    //max sum sub array of  size k
    public static  int minSumSubArray(int [] nums,  int k){

        if(nums.length< k){
            return -1;
        }
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j < n ){

            sum += nums[j]; 
            if(j-i+1 <k ){
                j++;
            } else if (j-i+1==k) {
                min = Math.min(min,sum);
                sum -= nums[i];
                i++;
                j++;
            }

        }
        return min;
    }


    public static  int maxSumSubArray(int [] nums,  int k){

        if(nums.length< k){
            return -1;
        }
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int max = 0;
        while(j < n ){
            sum += nums[j];
            if(j-i+1 <k ){
                j++;
            } else if (j-i+1==k) {
                max = Math.max(max,sum);
                sum -= nums[i];
                i++;
                j++;
            }

        }
        return max;
    }



    public static  int maxSumSubArrayWithUnique(int [] arr,  int k){

        int i = 0;
        int j = 0;
        int ans = 0;
        int n = arr.length;
        HashSet<Integer> st = new HashSet<>();
        int sum = 0;

        while (j < n) {
            // Remove duplicates from the window
            while (st.contains(arr[j])) {
                sum -= arr[i]; // Corrected `sum =- arr[i]` to `sum -= arr[i]`
                st.remove(arr[i]);
                i++;
            }

            // Add the current element to the sum and set
            sum += arr[j]; // Corrected `sum =+ arr[j]` to `sum += arr[j]`
            st.add(arr[j]);

            // If the window size matches `k`
            if (j - i + 1 == k) {
                ans = Math.max(ans, sum); // Update the answer
                // Slide the window
                sum -= arr[i]; // Remove the first element of the window from the sum
                st.remove(arr[i]);
                i++;
            }

            j++;
        }

        return ans;

    }

    public long maximumSubarraySum(int[]nums,int k){
       int  max=Arrays.stream(nums).max().getAsInt();
        boolean[]vis=new boolean[max+1];
        long ans=0;
        long curWindowSum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            curWindowSum+=nums[j];
            while(vis[nums[j]]){
                curWindowSum-=nums[i];
                vis[nums[i++]]=false;
            }
            if(j-i+1==k){
                ans=Math.max(ans,curWindowSum);
                curWindowSum-=nums[i];
                vis[nums[i++]]=false;
            }
            vis[nums[j]]=true;
        }
        return ans;
    }

    public static ArrayList<Integer> sumOfSubArray(int [] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        int n = arr.length;
        int sum = 0;
        while(j< n){
            sum += arr[j];
            if(j-i+1< k){
                j++;
            }else if(j-i+1==k){
                ans.add(sum);
                sum = sum -arr[i];
                i++;
                j++;
            }

        }
        return ans;
    }

    // max sum in all sub array of size k

    public static ArrayList<Integer> negativeNumber(int [] arr, int n , int k){

        ArrayList<Integer > list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i= 0;
        int j= 0;

        while (j< n ){
                if(arr[j]<0){
                    queue.add(arr[j]);
                }
                if(j-i+1 < k){
                    j++;

                }
                if(j-i+1 ==k){
                    if(queue.isEmpty()){
                        list.add(0);
                    }
                    else{
                       list.add(queue.peek());
                       if(arr[i]==queue.peek()){
                           queue.remove();


                       }

                    }
                    i++;
                    j++;
                }




        }
        return list;


    }
    public static  int maxInSubarray(int[] arr, int k, int threshold) {
        ArrayList<Integer > list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
            int i = 0;
            int j = 0;
            int max = 0;
            int n = arr.length;

            while  (j<n){

                while(!queue.isEmpty() && queue.peek() <arr[j]){
                    queue.remove();
                }
                queue.add(arr[j]);
                //calculation
                if(j-i+1<n){
                    j++;
                }

                if(j-i+1==k){
                    //get the answer from calculation
                    list.add(queue.peek());

                }

            }

          return -1;
    }

    public static int maxSumSubArrayWithNotUniqueElements(int [] arr,int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum= Integer.MIN_VALUE;
        int n = arr.length;
        HashMap< Integer, Integer> mp = new HashMap<>();
        while(j< n){

            mp.put(arr[j], mp.getOrDefault(arr[j], 0) + 1);
            if(mp.get(arr[j]) ==1 ){
                sum = sum+ arr[j];
            }
            if( j-i+1 < k){
                j++;
            }
            if( j-i+1 == k){
                    maxSum = Math.max(maxSum, sum);

                if (mp.get(arr[i]) == 1) {
                    sum -= arr[i];
                }

                mp.put(arr[i], mp.get(arr[i]) - 1);
                if(mp.get(arr[i])== 0){
                    mp.remove(arr[i]);
                }

                i++;
            }

            j++;



        }
        return maxSum;
    }

}
