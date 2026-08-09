class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int t=nums[i]+nums[j];
                if(t==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}