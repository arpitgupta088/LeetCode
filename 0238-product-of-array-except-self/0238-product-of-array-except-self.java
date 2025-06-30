class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];   // i inex pe jo element h uske piche ka products ka array
        int suffix[] = new int[n];    // i se baad ke prducts ka array
        int ans[] = new int[n];

        // build prefix product array
        prefix[0] = 1;   // 1st eklement ka prefix kch ni hoga to 1 dedo
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // suffix prod array
        suffix[n-1] = 1;
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // ans array of multiply of pref and suff
        for (int i=0;i<n;i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}