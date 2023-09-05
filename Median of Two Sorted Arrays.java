import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();
        
        // Merge both arrays into a single array
        for (int num : nums1) {
            merge.add(num);
        }
        for (int num : nums2) {
            merge.add(num);
        }
        
        // Sort the merged array
        Collections.sort(merge);
        
        int n = merge.size();
        
        if (n % 2 != 0) {
            // If the merged array has an odd length, return the middle element
            return merge.get(n / 2);
        } else {
            // If the merged array has an even length, return the average of the two middle elements
            int mid1 = merge.get(n / 2 - 1);
            int mid2 = merge.get(n / 2);
            return (double) (mid1 + mid2) / 2.0;
        }
    }
}
