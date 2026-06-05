class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        for (i in 1 until nums.size) {
            if (nums[i-1] == nums[i]) {
                return true
            }
        }
        return false
    }
}
