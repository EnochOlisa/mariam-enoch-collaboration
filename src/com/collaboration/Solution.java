package com.collaboration;

public class Solution {
    public static void pancakeSort(int[] inputArray) {
        
    }
    
    private static int find(int[] A, int target) {
    	
        int maxTarget = 0;

    	for (int i = 1; i <= target; i++){
			if (A[i] > A[maxTarget]){
				maxTarget = i;    
			}
			
        }
        return maxTarget;
    }
    
    private static void flip(int[] A, int index) {
        
    	int l = 0, j = index;
        while(l < j){
            int temp = A[l];
            A[l] = A[j];
            A[j] = temp;
            l++;
            j--;
        }
        
        
    }

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
    }
}
