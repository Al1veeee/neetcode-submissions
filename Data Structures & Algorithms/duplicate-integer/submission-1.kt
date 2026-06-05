class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val slow = 0
        val fast = 0
        while (slow < nums.size-1) {
            if (nums[slow] == nums[fast]) {
                slow = fast
                return true
                break
            } else {
                fast++
            }
        }
    }
}
