class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        // Start from the last elements of the meaningful parts of arr1 and arr2
        int i = m - 1; // Pointer for the last element in arr1
        int j = n - 1; // Pointer for the last element in arr2
        int k = m + n - 1; // Pointer for the last position in arr1

        // Merge arr1 and arr2, starting from the back
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        // If there are still elements in arr2, copy them
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

    }
}
