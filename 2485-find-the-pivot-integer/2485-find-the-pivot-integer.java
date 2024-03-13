class Solution {
    public int pivotInteger(int n) {
        int[] arr = new int[n];
        
        // Initialize the array with consecutive integers from 1 to n
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        // If there's only one element, it's the pivot
        if (arr.length == 1) {
            return arr[0];
        }
        
        // Compute the total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        // Initialize the left sum
        int leftSum = 0;
        
        // Iterate through the array to find the pivot
        for (int i = 0; i < n; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return arr[i];
            }
            leftSum += arr[i];
        }
        
        // No pivot found
        return -1;
    }
}
