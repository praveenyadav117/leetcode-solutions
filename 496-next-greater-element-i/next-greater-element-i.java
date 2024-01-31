class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int found = nums2.length+1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = j;
                }
                if (j > found && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                } else {
                    ans[i] = -1;
                }

            }
        }
        return ans;
    }
}