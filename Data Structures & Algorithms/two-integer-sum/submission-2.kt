class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val list = mutableListOf<Int>()
        var left = 0
        var right = nums.size-1
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--
            } else if (nums[left] + nums[right] < target) {
                left++
            } else {
                list.add(left)
                list.add(right)
                break
            }
        }
        return list.toIntArray()
    }
}
