class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];

        int i = 0;
        int j = 0;
        int c = 0;

        while(i<m && j<n)
            result[c++] = nums1[i]<=nums2[j] ? nums1[i++] : nums2[j++];
        while(i<m)
            result[c++] = nums1[i++];
        while(j<n)
            result[c++] = nums2[j++];
        
        i = 0;
        while(i<m+n)
            nums1[i] = result[i++];
    }
}
