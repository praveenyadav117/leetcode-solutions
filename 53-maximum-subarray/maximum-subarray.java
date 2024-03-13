class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int curres = 0;
        for(int num:nums){
            curres+=num;
            if(curres>res){
                res = curres;
            }
            if(curres<0){
                curres=0;
            }
        }
        return res;
        // int res = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         res = Math.max(sum,res);
        //     }
        // }
        // return res;
    }
}