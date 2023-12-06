class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
        for(int i = 0; i<nums.length;i++){
            if(i+1 < nums.length){
                if(nums[i]+nums[i+1] == target){
                    two[0] = nums[i];
                    two[1] = nums[i+1];
                    return two;
                }
            }


        }

    }

}