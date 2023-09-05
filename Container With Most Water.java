import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int maxArea(int[] height) {
        // Create an ArrayList to store the areas
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Loop through the height array from left to right
        for (int i = 0; i < height.length; i++) {
            // Calculate the distance 'p' between the two lines
            int p = height.length-i-1 ; 
            
            // Calculate the minimum height between the current line and the last line
            int m = Math.min(height[i], height[height.length - 1]);
            
            // Calculate the area and add it to the ArrayList
            arr.add(p * m);
        }
        
        // Sort the ArrayList to get the maximum area
        Collections.sort(arr);
        
        // Return the maximum area from the sorted ArrayList
        return arr.get(arr.size() - 1);
    }
}

