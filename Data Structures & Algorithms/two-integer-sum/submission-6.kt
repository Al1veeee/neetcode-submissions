class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size-1

        while (left < right) {
            val sum = nums[left] + nums[right]

            if (sum > target) {
                right--
            } else if (sum < target) {
                left++
            } else {
                return intArrayOf(left, right)

            }
        }
        return intArrayOf()
    }
}
