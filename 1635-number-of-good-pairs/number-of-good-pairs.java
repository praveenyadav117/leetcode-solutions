class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        for(int j=0;j<nums.length;j++){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]==nums[j]) res++;
            }
        }
        return res;
        
    }
}