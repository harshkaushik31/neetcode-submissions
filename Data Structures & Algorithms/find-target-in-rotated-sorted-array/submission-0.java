class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] <= nums[high]){ // right part sorted
                if(target >= nums[mid] && target <= nums[high]){ // target in btwn
                    low = mid + 1;
                } 
                else{
                    high = mid - 1;
                }
            }
            else{ // left half sorted
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
