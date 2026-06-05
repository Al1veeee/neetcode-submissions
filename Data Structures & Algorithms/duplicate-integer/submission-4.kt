class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = hashSetOf<Int>()
        for (i in nums) {
            if (set.contains(i)) {
                return true
            } else {
                set.add(i)
            }
        }
        return false
    }
}
