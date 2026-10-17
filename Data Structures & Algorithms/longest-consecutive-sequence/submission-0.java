class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            hs.add(nums[i]);
        }
        int maxCount = 0;
        for(int i = 0; i < n;  i++){
            if(hs.contains(nums[i]-1)){
                continue;
            }
            int num = nums[i];
            int count = 0;
            while(hs.contains(num)){
                count++;
                num++;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}
