class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            arr1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            arr2.add(nums2[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        for(int num : arr1){
            if(!arr2.contains(num)){
                ans1.add(num);
            }
        }

        for(int num : arr2){
            if(!arr1.contains(num)){
                ans2.add(num);
            }
        }

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }
}