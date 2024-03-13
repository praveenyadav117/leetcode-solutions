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
    }
}