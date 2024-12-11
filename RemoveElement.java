class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val)
                result[c++] = nums[i];
        }
        for(int i=0;i<c;i++)
            nums[i] = result[i];
        for(int i=c;i<nums.length;i++){
            nums[i] = val;
        }
        return c;
    }
}
