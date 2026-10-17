class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] suffixProduct = new int[n];
        int prefixProduct = nums[0];
        suffixProduct[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0; i--){
            suffixProduct[i] = nums[i] * suffixProduct[i+1]; 
        }

        int [] ans = new int[n];
        ans[0] = suffixProduct[1];
        
        for(int i = 1; i < n-1; i++){
            ans[i] = prefixProduct * suffixProduct[i+1];
            prefixProduct *= nums[i];
        }
        ans[n-1] = prefixProduct;

        return ans;
    }
}  
