package com.collaboration;

import java.util.Arrays;

public class Solution {
    public static void pancakeSort(int[] inputArray) {
    	// Start from the complete array and one by one reduce current size by one
        for (int curr_size = inputArray.length - 1; curr_size > 0; --curr_size)
        {
            // Find index of the maximum element in]
            int m = find(inputArray, curr_size);
  
            // Move the maximum element to end of current array if it's not already at  the end
            if (m != curr_size)
            {
                // To move at the end, first move maximum number to beginning
                flip(inputArray, m);
  
                // Now, move the maximum number to end by reversing current array
                flip(inputArray, curr_size);
            }
        }
    }
    
    private static int find(int[] a, int target) {
    	
        int maxTarget = 0;

    	for (int i = 1; i <= target; i++){
			if (a[i] > a[maxTarget]){
				maxTarget = i;    
			}
        }
        return maxTarget;
    }
    
    private static void flip(int[] a, int index) {
        
    	int l = 0, j = index;
        while(l < j){
            int temp = a[l];
            a[l] = a[j];
            a[j] = temp;
            l++;
            j--;
        }
        
    }

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
