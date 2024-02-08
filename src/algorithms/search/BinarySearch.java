package algorithms.search;

import java.util.Arrays;

public class BinarySearch {


    /**
     * This function processes the search binary algorithm using a while loop
     * it return the index of the element if it found, otherwise it returns -1
     * @param nums
     * @param target
     * @return
     */
    public static int find(int [] nums,int target){
        int left = 0;
        int right = nums.length - 1;

        //we need to sort our array first, as the binary search is performed on a sorted array,
        Arrays.sort(nums);

        while (left <=right){
            int mid = (left +right)/2;

            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
                right = mid-1;
            else
                left = mid +1;
        }
        return  -1;
    }


    /**
     * this function perform the binary search using recursion
     * @param nums
     * @param target
     * @param left
     * @param right
     * @return
     */
    public static  int recursionSearch(int [] nums,int target,int left, int right){
        int mid = (left + right)/2;
        if( target  ==  nums[mid])
            return mid;
        else if(target < nums[mid])
            recursionSearch(nums,target,left,mid-1);
        else
            recursionSearch(nums,target,mid+1,right);

        return  -1;
    }

}
