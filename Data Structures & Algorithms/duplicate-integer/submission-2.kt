class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var slow = 0
        var fast = 0
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
