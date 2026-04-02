class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // int [] prefix = new int[n];
        // int [] suffix = new int[n];
        int [] ans = new int [n];
        Arrays.fill(ans,1);
        int curr = 1;
        for(int i=0;i<n;i++){
            ans[i] = ans[i]*curr;
            curr = curr*nums[i];
        }
        int curr1= 1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*curr1;
            curr1=curr1*nums[i];
        }

        // for(int i=0;i<n;i++){
        //     ans[i]=prefix[i]*suffix[i];
        // }
        return ans;
    }
}