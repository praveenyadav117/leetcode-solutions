class Solution {
    public int countOperations(int nums1, int nums2) {
        
        int res = 0;
        while(nums2 > 0 && nums1 >0){

            if(nums1>nums2){
                nums1 = nums1-nums2;
                res++;
            }
            else{
                nums2=nums2-nums1;
                res++;
            }
           
        }
    
        return res;
    }
    
}