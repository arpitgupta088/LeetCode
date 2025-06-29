// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // brute force approach 
//         int n = nums.length;
//         for (int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

//OPTIMISED APPROACH using hashset
//TC => O(n)
class Solution{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);   // agar num nahi hai hashset me phle se to usey add krdo
        }
        return false;        // no duplicates
    }
}